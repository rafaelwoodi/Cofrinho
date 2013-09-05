package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsuarioDAO;
import com.model.Usuarios;

@Service
@Transactional
public class UsuarioServiceImpl {
	@Autowired
	private UsuarioDAO UsuarioDAO;

	public void addUsuario(Usuarios usuario) {
		UsuarioDAO.addUsuario(usuario);		
	}

	public void updateUsuario(Usuarios usuario) {
		UsuarioDAO.updateUsuario(usuario);
	}

	public Usuarios getUsuario(int cod_usuario) {
		return UsuarioDAO.getUsuario(cod_usuario);
	}

	public void deleteUsuario(int cod_usuario) {
		UsuarioDAO.deleteUsuario(cod_usuario);
	}

	public List<Usuarios> getUsuarios() {
		return UsuarioDAO.getUsuarios();
	}

}
