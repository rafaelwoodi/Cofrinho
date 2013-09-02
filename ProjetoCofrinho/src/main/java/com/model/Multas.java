package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (schema="cofrinho", name="multas")
public class Multas {
  @Id
  @GeneratedValue
  private Integer codMulta;
  private Integer codTipoMulta;
  private double valor;
  
public Integer getCodMulta() {
	return codMulta;
}
public void setCodMulta(Integer codMulta) {
	this.codMulta = codMulta;
}
public Integer getCodTipoMulta() {
	return codTipoMulta;
}
public void setCodTipoMulta(Integer codTipoMulta) {
	this.codTipoMulta = codTipoMulta;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
} 
}