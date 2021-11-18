package br.com.pcon.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pcon.api.model.Dna;
import br.com.pcon.api.repository.DnaRepository;

@RestController
@RequestMapping("/dna")
public class DnaController {

	@Autowired
	private DnaRepository dnaRepository;

	/*
	@GetMapping
	public ResponseEntity<?> listAll() {
		List<Category> list = categoryRepository.findAll(); 
		return !list.isEmpty() ? ResponseEntity.ok(list) : ResponseEntity.noContent().build();
	}
	*/

	@GetMapping
	public List<Dna> listAll() {
		return dnaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Dna> dnaMethod(@Param(value = "dna") String dna) {
		return null;
	}
	
	
	
}
