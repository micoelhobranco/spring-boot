package com.employee.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EMPLOYEE")

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long id;

private Date creationdate;

private String cargo;

private int cpf;

private String nome;

private String ds_uf;

private BigDecimal salario;

private String status;

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDs_uf() {
		return ds_uf;
	}

	public void setDs_uf(String ds_uf) {
		this.ds_uf = ds_uf;
	}

	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
