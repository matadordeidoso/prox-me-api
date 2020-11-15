package com.programacaoweb.proxme.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "turma")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turma implements Serializable {

	private static final long serialVersionUID = -3098989106412858050L;

	@Id
	@Column(name = "id", nullable = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_curso", referencedColumnName = "id", nullable = false)
	private Curso curso;

}
