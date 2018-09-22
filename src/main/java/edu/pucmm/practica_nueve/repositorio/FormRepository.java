package edu.pucmm.practica_nueve.repositorio;

import edu.pucmm.practica_nueve.entidades.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FormRepository extends JpaRepository<Form, Long> {

    Form findByNombre(String nombre);

    List<Form> findAllByOrOrderByNombreAsc();

    Form findByIdIs(Long id);

}
