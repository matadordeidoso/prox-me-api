package com.programacaoweb.proxme.controller;

import com.programacaoweb.proxme.dto.TurmaDTO;
import com.programacaoweb.proxme.entity.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.programacaoweb.proxme.service.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {

	@Autowired
	private TurmaService turmaService;

	@GetMapping(path = "/{idCurso}")
	public ResponseEntity<?> buscarTurmasPeloIdCurso(@PathVariable Long idCurso) {
		return ResponseEntity.ok(turmaService.buscarTurmasPeloIdCurso(idCurso));
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody TurmaDTO turmaDTO) {
		return ResponseEntity.ok(turmaService.cadastrar(turmaDTO));
	}

	@GetMapping
	public ResponseEntity<?> buscarTodasAsTurmas() {
		return ResponseEntity.ok(turmaService.buscarTodasAsTurmas());
	}
}
