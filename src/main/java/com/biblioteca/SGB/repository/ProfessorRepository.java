package com.biblioteca.SGB.repository;

import com.biblioteca.SGB.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
