package com.biblioteca.SGB.controller;

import com.biblioteca.SGB.models.Aluno;
import com.biblioteca.SGB.models.Professor;
import com.biblioteca.SGB.repository.AlunoRepository;
import com.biblioteca.SGB.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leitores")
public class LeitoresController {

    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping("/alunos")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @PostMapping("/professores")
    public Professor cadastrarProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
}
