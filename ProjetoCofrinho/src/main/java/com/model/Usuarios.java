package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (schema="cofrinho", name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue
	private Integer cod_usuario;	
	private Integer cod_tipo_usuario;
	private Integer cod_equipe;
	
    private String login;
	private String nome;
	private String senha;
	
	public Integer getCod_tipo_usuario() {
		return cod_tipo_usuario;
	}
	public void setCod_tipo_usuario(Integer cod_tipo_usuario) {
		this.cod_tipo_usuario = cod_tipo_usuario;
	}
	public Integer getCod_equipe() {
		return cod_equipe;
	}
	public void setCod_equipe(Integer cod_equipe) {
		this.cod_equipe = cod_equipe;
	}
	public void setCod_usuario(Integer cod_usuario) {
		this.cod_usuario = cod_usuario;
	}	
	
	public int getCod_usuario() {
		return cod_usuario;
	}
	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}	

}
