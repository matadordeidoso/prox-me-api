package com.programacaoweb.proxme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacaoweb.proxme.adapter.CursoAdapter;
import com.programacaoweb.proxme.dto.CursoDTO;
import com.programacaoweb.proxme.entity.Curso;
import com.programacaoweb.proxme.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private CursoAdapter cursoAdapter;

	public List<CursoDTO> findAll() {
		List<Curso> cursos = cursoRepository.findAll();
		List<CursoDTO> cursosDTO = new ArrayList<CursoDTO>();
		cursos.stream().forEach(curso -> cursosDTO.add(cursoAdapter.toDto(curso)));
		return cursosDTO;
	}

	public Curso salvar(CursoDTO cursoDTO) {
		return cursoRepository.save(cursoAdapter.toEntity(cursoDTO));
	}

}
