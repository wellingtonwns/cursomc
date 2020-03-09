package com.wellingtonsouza.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellingtonsouza.cursomc.domain.Categoria;
import com.wellingtonsouza.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) throws com.wellingtonsouza.cursomc.services.exceptions.ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(()-> new com.wellingtonsouza.cursomc.services.exceptions.ObjectNotFoundException("Objeto não encontrado! Id:"+
				id + ", Tipo:" + Categoria.class.getName()));
				
	}

}
