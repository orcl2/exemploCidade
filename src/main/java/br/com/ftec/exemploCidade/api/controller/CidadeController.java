package br.com.ftec.exemploCidade.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ftec.exemploCidade.api.service.CidadeService;
import br.com.ftec.exemploCidade.domain.model.CidadeResponse;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

	@Autowired
	CidadeService cidadeService;

	@GetMapping(path = "/", params = "nome")
	public ResponseEntity<Optional<CidadeResponse>> buscar(@RequestParam String nome) {
		Optional<CidadeResponse> cidade = cidadeService.buscaCidades(nome);

		if(cidade.isPresent())
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(cidade);

		return ResponseEntity.notFound().build();
	}

}
