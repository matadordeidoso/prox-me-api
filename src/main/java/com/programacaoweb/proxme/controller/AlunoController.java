package com.programacaoweb.proxme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacaoweb.proxme.entity.Aluno;
import com.programacaoweb.proxme.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	@GetMapping
	public ResponseEntity<?> buscarTodosAlunos() {
		List<Aluno> alunos = alunoService.findAll();
		return ResponseEntity.ok(alunos);
	}

}
