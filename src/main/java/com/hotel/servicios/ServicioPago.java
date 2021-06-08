package com.hotel.servicios;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.modelos.Pagos;


@Service
public class ServicioPago {
	
	@Autowired
	private RepoPago repoPago;
	private String Mensaje;
	
	public String getMensaje() {
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean registroPago(Pagos p, HttpSession sesion)
	{
		try {
		repoPago.save(p);
		sesion.setAttribute("idPago", p.getId());
		this.Mensaje="Se realizó el pago correctamente";
		return true;
	}
	catch (Exception e) {
		this.Mensaje = "Error al registrar la reservacion.";
		return false;
		}
	}
	
	
	public Iterable<Pagos>verTodos()
	{
		try {
			this.Mensaje="";
			return repoPago.findAll();
		}catch (Exception e) {
			this.Mensaje=e.getMessage();
			return null;
		}
	}
	
	
	public Pagos buscar(int id) {
		try {
			this.Mensaje="";
			Pagos pago = repoPago.findById(id).get();
			return pago == null ? new Pagos(): pago;
		}catch (Exception e) {
			this.Mensaje= e.getMessage();
			return null;
		}
	}
}
