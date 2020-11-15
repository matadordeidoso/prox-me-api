package com.programacaoweb.proxme.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.programacaoweb.proxme.dto.CursoDTO;
import com.programacaoweb.proxme.dto.TurmaDTO;
import com.programacaoweb.proxme.entity.Curso;
import com.programacaoweb.proxme.entity.Turma;
import com.programacaoweb.proxme.util.Util;

@Component
public class CursoAdapter {

	@Autowired
	private TurmaAdapter turmaAdapter;

	public CursoDTO toDto(Curso curso) {
		List<TurmaDTO> turmasDTO = !Util.isNull(curso.getTurmas())
				? curso.getTurmas().stream().map(turma -> turmaAdapter.toDto(turma)).collect(Collectors.toList())
				: new ArrayList<TurmaDTO>();
		return CursoDTO.builder().id(curso.getId()).nome(curso.getNome()).turmas(turmasDTO).build();
	}

	public Curso toEntity(CursoDTO cursoDTO) {
		List<Turma> turmas = !Util.isNull(cursoDTO.getTurmas()) ? cursoDTO.getTurmas().stream()
				.map(turmaDTO -> turmaAdapter.toEntity(turmaDTO)).collect(Collectors.toList()) : new ArrayList<Turma>();
		return Curso.builder().id(cursoDTO.getId()).nome(cursoDTO.getNome()).turmas(turmas).build();
	}

}
