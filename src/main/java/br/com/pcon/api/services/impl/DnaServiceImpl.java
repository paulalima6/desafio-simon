package br.com.pcon.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pcon.api.model.Dna;
import br.com.pcon.api.repository.DnaRepository;
import br.com.pcon.api.services.DnaService;

public class DnaServiceImpl implements DnaService {

	@Autowired
	private DnaRepository dnaServiceRepository;
	
	@Override
	public List<Dna> findAll() {
		return dnaServiceRepository.findAll();
	}
}
