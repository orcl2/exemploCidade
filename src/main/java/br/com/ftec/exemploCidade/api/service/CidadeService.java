package br.com.ftec.exemploCidade.api.service;

import java.util.Optional;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.ftec.exemploCidade.api.service.component.CidadeServiceFallback;
import br.com.ftec.exemploCidade.domain.model.CidadeResponse;
import feign.codec.Decoder;

@FeignClient(value = "cidadeService", 
			 url = "https://servicodados.ibge.gov.br/api/v1/localidades/municipios/",
			 fallback = CidadeServiceFallback.class)
public interface CidadeService {
	
	@GetMapping(path = "{municipio}")
	Optional<CidadeResponse> buscaCidades(@PathVariable("municipio") String municipio);

}

