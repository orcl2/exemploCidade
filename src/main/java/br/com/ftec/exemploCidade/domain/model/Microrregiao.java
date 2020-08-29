package br.com.ftec.exemploCidade.domain.model;

import lombok.Data;

@Data
public class Microrregiao {

	private Long id;
	private String nome;
	private Mesorregiao mesorregiao;
	
}
