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

import com.GearTech.geartech.entity.ResultadosEDC;
import com.GearTech.geartech.repository.ResultadosEDCRepository;

@RestController
@RequestMapping("/resultadoDentesConicos")
public class ResultadosEDCController {

	@Autowired
	private ResultadosEDCRepository resultadosEDCRepository;
	
	@GetMapping
	public Iterable<ResultadosEDC> findIAll(){
		return resultadosEDCRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<ResultadosEDC> findById(@PathVariable Long id) {
		return resultadosEDCRepository.findById(id);
	}
	
	@PostMapping
	public ResultadosEDC createResultadosEDR(@RequestBody ResultadosEDC resultadosEDC) {
		return resultadosEDCRepository.save(resultadosEDC);
	}
	
	@PutMapping("/{id}")
	public ResultadosEDC updateResultadosEDR(@PathVariable Long id, @RequestBody ResultadosEDC resultadosEDC) {
		resultadosEDC.setId(id);
		return resultadosEDCRepository.save(resultadosEDC);
	}
	
	@DeleteMapping("{id}")
	public void deleteResultadosEDR(@PathVariable Long id) {
		resultadosEDCRepository.deleteById(id);
	}
}
