package br.edu.iftm.crud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.edu.iftm.crud.model.Professor;

@Repository
public class ProfessorRepository {
    
    @Autowired
    JdbcTemplate jdbc;

    public List<Professor> todos() {
        String consulta = "SELECT * FROM PROFESSOR;";
        return jdbc.query(consulta, 
            (resultados, numeroDaLinha) ->
                 new Professor(resultados.getInt("id"),resultados.getString("nome")));
    }
}
