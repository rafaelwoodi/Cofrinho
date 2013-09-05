package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Usuarios;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addUsuario(Usuarios usuario) {
		getCurrentSession().save(usuario);
	}

	public void updateUsuario(Usuarios usuario) {
		Usuarios usuarioToUpdate = getUsuario(usuario.getCod_usuario());
		usuarioToUpdate.setCod_equipe(usuario.getCod_equipe());
		usuarioToUpdate.setCod_tipo_usuario(usuario.getCod_tipo_usuario());
		usuarioToUpdate.setLogin(usuario.getLogin());
		usuarioToUpdate.setNome(usuario.getNome());
		usuarioToUpdate.setSenha(usuario.getSenha());
		getCurrentSession().update(usuarioToUpdate);
		
	}

	public Usuarios getUsuario(int cod_usuario) {
		Usuarios usuario = (Usuarios) getCurrentSession().get(Usuarios.class, cod_usuario);
		return usuario;
	}

	public void deleteUsuario(int cod_usuario) {
		Usuarios usuario = getUsuario(cod_usuario);
		if (usuario != null)
			getCurrentSession().delete(usuario);
	}

	@SuppressWarnings("unchecked")
	public List<Usuarios> getUsuarios() {
		return getCurrentSession().createQuery("from usuarios").list();
	}

}
