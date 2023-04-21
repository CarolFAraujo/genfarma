package com.generation.genfarma.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.genfarma.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	public List<Produto> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	public List<Produto> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
	public List<Produto> findAllByNomeAndFabricante(String nome, String fabricante);
	
	public List<Produto> findAllByNomeOrFabricante(String nome, String fabricante);
	
	public List<Produto> findAllByPrecoBetween(BigDecimal inicio, BigDecimal fim);

}
