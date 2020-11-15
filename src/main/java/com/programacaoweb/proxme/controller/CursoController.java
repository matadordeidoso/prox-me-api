package com.programacaoweb.proxme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacaoweb.proxme.dto.CursoDTO;
import com.programacaoweb.proxme.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@GetMapping
	public ResponseEntity<?> buscarTodosCursos() {
		return ResponseEntity.ok(cursoService.findAll());
	}

	@PostMapping
	public ResponseEntity<?> cadastrar(@RequestBody CursoDTO cursoDTO) {
		return ResponseEntity.ok(cursoService.salvar(cursoDTO));
	}

}
