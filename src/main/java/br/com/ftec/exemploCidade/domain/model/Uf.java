package br.com.ftec.exemploCidade.domain.model;

import lombok.Data;

@Data
public class Uf {

	private Long id;
	private String sigla;
	private String nome;
	private Regiao regiao;
	
}
