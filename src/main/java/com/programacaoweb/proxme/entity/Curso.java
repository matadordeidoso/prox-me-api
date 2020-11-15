package com.programacaoweb.proxme.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "curso")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso implements Serializable {

	private static final long serialVersionUID = 3404936546294999888L;

	@Id
	@Column(name = "id", nullable = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@OneToMany(mappedBy = "curso", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Turma> turmas;
}
