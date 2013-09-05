package com.service;

import java.util.List;

import com.model.Usuarios;

public interface UsuarioService {
	
	public void addUsuario(Usuarios usuario);
	public void updateUsuario(Usuarios usuario);
	public Usuarios getUsuario(int cod_usuario);
	public void deleteUsuario(int cod_usuario);
	public List<Usuarios> getUsuarios();

}
