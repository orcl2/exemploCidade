package br.com.ftec.exemploCidade.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Mesorregiao {

	private Long id;
	private String nome;
	@JsonProperty("UF")
	private Uf uf;
	
}
