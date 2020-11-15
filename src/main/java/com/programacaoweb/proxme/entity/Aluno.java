package com.programacaoweb.proxme.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aluno")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno implements Serializable {

	private static final long serialVersionUID = -5093518368096771037L;

	@Id
	@Column(name = "id", nullable = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "matricula")
	private String matricula;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "nome")
	private String nome;

}
