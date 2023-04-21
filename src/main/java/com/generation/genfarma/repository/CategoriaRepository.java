package com.generation.genfarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.genfarma.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByClasseContainingIgnoreCase(String classe);

}
