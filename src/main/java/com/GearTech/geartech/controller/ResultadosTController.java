package com.GearTech.geartech.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GearTech.geartech.entity.ResultadosT;
import com.GearTech.geartech.repository.ResultadosTRepository;

@RestController
@RequestMapping("/resultadoTransmissoes")
public class ResultadosTController {

	@Autowired
	private ResultadosTRepository resultadosTRepository;
	
	@GetMapping
	public Iterable<ResultadosT> findIAll(){
		return resultadosTRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<ResultadosT> findById(@PathVariable Long id) {
		return resultadosTRepository.findById(id);
	}
	
	@PostMapping
	public ResultadosT createResultadosT(@RequestBody ResultadosT resultadosT) {
		return resultadosTRepository.save(resultadosT);
	}
	
	@PutMapping("/{id}")
	public ResultadosT updateResultadosT(@PathVariable Long id, @RequestBody ResultadosT resultadosT) {
		resultadosT.setId(id);
		return resultadosTRepository.save(resultadosT);
	}
	
	@DeleteMapping("{id}")
	public void deleteResultadosT(@PathVariable Long id) {
		resultadosTRepository.deleteById(id);
	}
}
