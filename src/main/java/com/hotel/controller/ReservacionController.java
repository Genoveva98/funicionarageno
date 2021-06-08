package com.hotel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel.modelos.Reservacion;
import com.hotel.modelos.Usuario;
import com.hotel.servicios.ServicioReservacion;
import com.hotel.servicios.ServicioUsuario;



@Controller
public class ReservacionController {

	@Autowired
	ServicioReservacion servicioReservacion;
	@Autowired
	ServicioUsuario servicioUsuario;

	
	@GetMapping("/reservacion/registrar")
		public String registrarReservacion (Model modelo) {
			modelo.addAttribute("reservacion", new Reservacion());
			return "/reservacion/registrar";
		}
	
	@PostMapping("/reservacion/registrar")
	public String registrar(Model modelo, @ModelAttribute Reservacion r, HttpSession sesion )
	{
		int iduser= Integer.parseInt(sesion.getAttribute("iduser").toString());
		Usuario autor = servicioUsuario.buscar(iduser);
		if(autor== null || autor.getId()==0)
			modelo.addAttribute("error", servicioUsuario.getMensaje());
		else{
			r.setUsuario(autor);
			if(!servicioReservacion.registrar(r, sesion));
			modelo.addAttribute("error", servicioReservacion.getMensaje());
		}
			return "redirect:/reservacion/registroPago";
	}
	
}
