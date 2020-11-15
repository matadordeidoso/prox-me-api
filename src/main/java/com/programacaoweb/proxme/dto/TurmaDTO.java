package com.programacaoweb.proxme.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TurmaDTO implements Serializable {

	private static final long serialVersionUID = 54496632811122252L;

	private Long id;

	private String nome;

	private CursoDTO curso;

}
