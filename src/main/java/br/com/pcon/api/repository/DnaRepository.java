package br.com.pcon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pcon.api.model.Dna;

public interface DnaRepository extends JpaRepository<Dna, Long> {
}
