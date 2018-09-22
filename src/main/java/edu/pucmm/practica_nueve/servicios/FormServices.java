package edu.pucmm.practica_nueve.servicios;

import edu.pucmm.practica_nueve.entidades.Form;
import edu.pucmm.practica_nueve.repositorio.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FormServices {
    @Autowired
    private FormRepository formRepository;

    public Form buscarPorId(Long id){
        return formRepository.findByIdIs(id);
    }

    public Form buscarPorNombre(String nombre){
        return formRepository.findByNombre(nombre);
    }

    public List<Form> listaForms(){
        return formRepository.findAllByOrOrderByNombreAsc();
    }

    @Transactional
    public Form crearForm(Form form){
        formRepository.save(form);
        return form;
    }

}
