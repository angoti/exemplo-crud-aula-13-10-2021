package br.edu.iftm.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.crud.model.Professor;
import br.edu.iftm.crud.repository.ProfessorRepository;

@Controller
public class ProfessorController {

    @Autowired
    ProfessorRepository repo;
    
    @RequestMapping("/professores")
    public String todos(Model modelo) {
        List<Professor> listaDeProfessores = repo.todos(); 
        modelo.addAttribute("lista", listaDeProfessores);
        return "professores";
    }
}
