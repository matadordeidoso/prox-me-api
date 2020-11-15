package com.programacaoweb.proxme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.programacaoweb.proxme.entity.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

	@Query(" SELECT turma FROM Turma turma WHERE turma.curso.id = :idCurso ")
	public List<Turma> findTurmasByIdCurso(@Param("idCurso") Long idCurso);

}
