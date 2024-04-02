package com.GearTech.geartech.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="resultado_engrenagem_dentes_conicos")
public class ResultadosEDC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public float diametro_coroa;
	public float passo_axial;
	public float raio_topo_coroa;
	public float diametro_primitivo;
	public float passo_coroa;
	public float diametro_externo;
	public float raio_topo_coroa2;
	public float parafuso_sem_fim;
	public float passo_axial_parafuso;
	public float altura_elevacao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor professor;

	public ResultadosEDC() {
	}

	public ResultadosEDC(Long id, float diametro_coroa, float passo_axial, float raio_topo_coroa, float diametro_primitivo, float passo_coroa, float diametro_externo, float raio_topo_coroa2, float parafuso_sem_fim, float passo_axial_parafuso, float altura_elevacao, Aluno aluno, Professor professor) {
		this.id = id;
		this.diametro_coroa = diametro_coroa;
		this.passo_axial = passo_axial;
		this.raio_topo_coroa = raio_topo_coroa;
		this.diametro_primitivo = diametro_primitivo;
		this.passo_coroa = passo_coroa;
		this.diametro_externo = diametro_externo;
		this.raio_topo_coroa2 = raio_topo_coroa2;
		this.parafuso_sem_fim = parafuso_sem_fim;
		this.passo_axial_parafuso = passo_axial_parafuso;
		this.altura_elevacao = altura_elevacao;
		this.aluno = aluno;
		this.professor = professor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getDiametro_coroa() {
		return diametro_coroa;
	}

	public void setDiametro_coroa(float diametro_coroa) {
		this.diametro_coroa = diametro_coroa;
	}

	public float getPasso_axial() {
		return passo_axial;
	}

	public void setPasso_axial(float passo_axial) {
		this.passo_axial = passo_axial;
	}

	public float getRaio_topo_coroa() {
		return raio_topo_coroa;
	}

	public void setRaio_topo_coroa(float raio_topo_coroa) {
		this.raio_topo_coroa = raio_topo_coroa;
	}

	public float getDiametro_primitivo() {
		return diametro_primitivo;
	}

	public void setDiametro_primitivo(float diametro_primitivo) {
		this.diametro_primitivo = diametro_primitivo;
	}

	public float getPasso_coroa() {
		return passo_coroa;
	}

	public void setPasso_coroa(float passo_coroa) {
		this.passo_coroa = passo_coroa;
	}

	public float getDiametro_externo() {
		return diametro_externo;
	}

	public void setDiametro_externo(float diametro_externo) {
		this.diametro_externo = diametro_externo;
	}

	public float getRaio_topo_coroa2() {
		return raio_topo_coroa2;
	}

	public void setRaio_topo_coroa2(float raio_topo_coroa2) {
		this.raio_topo_coroa2 = raio_topo_coroa2;
	}

	public float getParafuso_sem_fim() {
		return parafuso_sem_fim;
	}

	public void setParafuso_sem_fim(float parafuso_sem_fim) {
		this.parafuso_sem_fim = parafuso_sem_fim;
	}

	public float getPasso_axial_parafuso() {
		return passo_axial_parafuso;
	}

	public void setPasso_axial_parafuso(float passo_axial_parafuso) {
		this.passo_axial_parafuso = passo_axial_parafuso;
	}

	public float getAltura_elevacao() {
		return altura_elevacao;
	}

	public void setAltura_elevacao(float altura_elevacao) {
		this.altura_elevacao = altura_elevacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura_elevacao, aluno, diametro_coroa, diametro_externo, diametro_primitivo, id,
				parafuso_sem_fim, passo_axial, passo_axial_parafuso, passo_coroa, professor, raio_topo_coroa,
				raio_topo_coroa2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultadosEDC other = (ResultadosEDC) obj;
		return Float.floatToIntBits(altura_elevacao) == Float.floatToIntBits(other.altura_elevacao)
				&& Objects.equals(aluno, other.aluno)
				&& Float.floatToIntBits(diametro_coroa) == Float.floatToIntBits(other.diametro_coroa)
				&& Float.floatToIntBits(diametro_externo) == Float.floatToIntBits(other.diametro_externo)
				&& Float.floatToIntBits(diametro_primitivo) == Float.floatToIntBits(other.diametro_primitivo)
				&& Objects.equals(id, other.id)
				&& Float.floatToIntBits(parafuso_sem_fim) == Float.floatToIntBits(other.parafuso_sem_fim)
				&& Float.floatToIntBits(passo_axial) == Float.floatToIntBits(other.passo_axial)
				&& Float.floatToIntBits(passo_axial_parafuso) == Float.floatToIntBits(other.passo_axial_parafuso)
				&& Float.floatToIntBits(passo_coroa) == Float.floatToIntBits(other.passo_coroa)
				&& Objects.equals(professor, other.professor)
				&& Float.floatToIntBits(raio_topo_coroa) == Float.floatToIntBits(other.raio_topo_coroa)
				&& Float.floatToIntBits(raio_topo_coroa2) == Float.floatToIntBits(other.raio_topo_coroa2);
	}

	@Override
	public String toString() {
		return "ResultadosEDC [id=" + id + ", diametro_coroa=" + diametro_coroa + ", passo_axial=" + passo_axial
				+ ", raio_topo_coroa=" + raio_topo_coroa + ", diametro_primitivo=" + diametro_primitivo
				+ ", passo_coroa=" + passo_coroa + ", diametro_externo=" + diametro_externo + ", raio_topo_coroa2="
				+ raio_topo_coroa2 + ", parafuso_sem_fim=" + parafuso_sem_fim + ", passo_axial_parafuso="
				+ passo_axial_parafuso + ", altura_elevacao=" + altura_elevacao + ", aluno=" + aluno + ", professor="
				+ professor + "]";
	}
}
