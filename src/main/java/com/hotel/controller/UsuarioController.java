package com.hotel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.modelos.Usuario;
import com.hotel.servicios.ServicioUsuario;



@Controller
public class UsuarioController {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	
	@GetMapping("/usuario/validar")
	public String validar() {
		return "usuario/validar";
	}
	
	@PostMapping("/usuario/validar")
	public String agregar(@RequestParam("correoe") String correoe,
			@RequestParam("clave") String clave,
			Model modelo, HttpSession sesion) {
		boolean res= servicioUsuario.validar(correoe, clave, sesion);
		if(res) {
			return "redirect:reservacion/registrar";
		}
		modelo.addAttribute("error", servicioUsuario.getMensaje());
		modelo.addAttribute("correoe", correoe);
		modelo.addAttribute("clave",clave);
		return "usuario/validar";
			
	}
	
	
	
	
	@GetMapping("/usuario/agregar")
	public String agregar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario/agregar";
	}
	
	@PostMapping("/usuario/agregar")
	public String agregar(Model modelo, @ModelAttribute Usuario user, 
			@RequestParam("clave") String clave, HttpSession sesion) {
		boolean res = servicioUsuario.agregar(user, clave,sesion);
		if (res) {
			return "redirect:reservacion/registrar";
		}
		
		modelo.addAttribute("error", servicioUsuario.getMensaje());
		return "usuario/agregar";
	}
	
	@GetMapping ("/usuario/informeHabitacion")
	public String Habitaciones() {
		return"usuario/informeHabitacion";
	}
	

	@GetMapping(path = {"/usuario/inicio", "/"})
	public String inicio() {
		return"usuario/inicio";
	}
	
	@GetMapping("/usuario/contacto")
	public String contacto() {
		return"usuario/contacto";
	}
}
