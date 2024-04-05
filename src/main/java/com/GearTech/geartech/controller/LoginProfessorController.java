package com.GearTech.geartech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GearTech.geartech.entity.Professor;
import com.GearTech.geartech.repository.ProfessorRepository;

@RestController
public class LoginProfessorController {

	@Autowired
	private ProfessorRepository professorRepository;

	@PostMapping("loginProfessor")
	public ResponseEntity<String> authenticate(@RequestBody LoginRequest loginRequest) {
		Professor professor = professorRepository.findByNif(loginRequest.getNif());
		if (professor != null && professor.getSenha().equals(loginRequest.getSenha())) {
			return ResponseEntity.ok("Login bem-sucedido!");
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas!");
		}
	}

	static class LoginRequest {
		private Long nif;
		private String senha;

		public Long getNif() {
			return nif;
		}

		public void setNif(Long nif) {
			this.nif = nif;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	}
}
