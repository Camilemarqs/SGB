package com.biblioteca.SGB.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Professores")
public class Professor extends Leitores{

    private String disciplina;

}
