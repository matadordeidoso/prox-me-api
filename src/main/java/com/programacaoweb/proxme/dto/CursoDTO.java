package com.programacaoweb.proxme.dto;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class CursoDTO implements Serializable {

	private static final long serialVersionUID = 1134515286548613132L;

	private Long id;

	private String nome;

	private List<TurmaDTO> turmas;

}
