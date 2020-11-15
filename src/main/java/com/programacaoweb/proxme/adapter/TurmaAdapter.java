package com.programacaoweb.proxme.adapter;

import com.programacaoweb.proxme.dto.CursoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.programacaoweb.proxme.dto.TurmaDTO;
import com.programacaoweb.proxme.entity.Curso;
import com.programacaoweb.proxme.entity.Turma;

@Component
public class TurmaAdapter {

	public TurmaDTO toDto(Turma turma) {
		return TurmaDTO.builder().id(turma.getId()).nome(turma.getNome())
				.curso(turma.getCurso() != null ? getCursoToDTO(turma.getCurso()) : null).build();
	}

	public Turma toEntity(TurmaDTO turmaDTO) {
		Curso curso = getCursoDTOToEntity(turmaDTO.getCurso());
		return Turma.builder().id(turmaDTO.getId()).nome(turmaDTO.getNome()).curso(curso).build();
	}

	public CursoDTO getCursoToDTO(Curso curso) {
		return CursoDTO.builder().id(curso.getId()).nome(curso.getNome()).build();
	}

	public Curso getCursoDTOToEntity(CursoDTO cursoDTO) {
		return Curso.builder().id(cursoDTO != null ? cursoDTO.getId() : null).build();
	}

}
