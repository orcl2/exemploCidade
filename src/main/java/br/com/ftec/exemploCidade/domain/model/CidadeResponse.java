package br.com.ftec.exemploCidade.domain.model;

import lombok.Data;

@Data
public class CidadeResponse {

	private Long id;
	private String nome;
	private Microrregiao microrregiao;
	
}
