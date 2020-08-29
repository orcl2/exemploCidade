package br.com.ftec.exemploCidade.api.service.component;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.ftec.exemploCidade.api.service.CidadeService;
import br.com.ftec.exemploCidade.domain.model.CidadeResponse;


@Component
public class CidadeServiceFallback implements CidadeService{
 
	@Override
	public Optional<CidadeResponse> buscaCidades(String municipio) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
}