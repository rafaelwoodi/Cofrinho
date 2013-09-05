package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Usuarios;
import com.service.UsuarioService;

public class UsuarioController {

	@Autowired
	private UsuarioService UsuarioService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addUsuarioPage() {
		ModelAndView modelAndView = new ModelAndView("add-usuario-form");
		modelAndView.addObject("usuarios", new Usuarios());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingTeam(@ModelAttribute Usuarios usuario) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		UsuarioService.addUsuario(usuario);
		
		String message = "Usuario adicionado com sucesso.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfTeams() {
		ModelAndView modelAndView = new ModelAndView("list-of-usuario");
		
		List<Usuarios> usuarios = UsuarioService.getUsuarios();
		modelAndView.addObject("usuarios", usuarios);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{cod_usuario}", method=RequestMethod.GET)
	public ModelAndView editUsuarioPage(@PathVariable Integer cod_usuario) {
		ModelAndView modelAndView = new ModelAndView("edit-usuario-form");
		Usuarios usuario = UsuarioService.getUsuario(cod_usuario);
		modelAndView.addObject("usuario",usuario);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{cod_usuario}", method=RequestMethod.POST)
	public ModelAndView edditingUsuario(@ModelAttribute Usuarios usuario, @PathVariable Integer cod_usuario) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		UsuarioService.updateUsuario(usuario);
		
		String message = "Usuario editado com sucesso.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{cod_usuario}", method=RequestMethod.GET)
	public ModelAndView deleteUsuario(@PathVariable Integer cod_usuario) {
		ModelAndView modelAndView = new ModelAndView("index");
		UsuarioService.deleteUsuario(cod_usuario);
		String message = "Usuario deletado com sucesso.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
