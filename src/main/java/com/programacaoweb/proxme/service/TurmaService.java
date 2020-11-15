package com.programacaoweb.proxme.service;

import java.util.List;
import java.util.stream.Collectors;

import com.programacaoweb.proxme.entity.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacaoweb.proxme.adapter.TurmaAdapter;
import com.programacaoweb.proxme.dto.TurmaDTO;
import com.programacaoweb.proxme.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository turmaRepository;

	@Autowired
	private TurmaAdapter turmaAdapter;

	public List<TurmaDTO> buscarTurmasPeloIdCurso(Long idCurso) {
		List<TurmaDTO> turmasDTO = turmaRepository.findTurmasByIdCurso(idCurso).stream().map(turma -> turmaAdapter.toDto(turma)).collect(Collectors.toList());
		return turmasDTO;
	}

	public TurmaDTO cadastrar(TurmaDTO turmaDTO) {
		Turma turma = turmaAdapter.toEntity(turmaDTO);
		turma = turmaRepository.save(turma);
		return turmaAdapter.toDto(turma);
	}

	public List<TurmaDTO> buscarTodasAsTurmas() {
		List<TurmaDTO> turmasDTO = turmaRepository.findAll().stream().map(turma -> turmaAdapter.toDto(turma)).collect(Collectors.toList());
		return turmasDTO;
	}

}
