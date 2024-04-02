package com.GearTech.geartech.entity;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name="resultado_engrenagem_dentes_helicoidas")
public class ResultadosEDH {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public float diametro_primitivo;
    public float modulo_normal;
    public float passo_normal;
    public float circulo_primitivo;
    public float circulo_cabeca;
    public float distancia_eixos_interno;
    
    @ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor professor;

	public ResultadosEDH() {
	}

	public ResultadosEDH(Long id, float diametro_primitivo, float modulo_normal, float passo_normal, float circulo_primitivo, float circulo_cabeca, float distancia_eixos_interno, Aluno aluno, Professor professor) {
		this.id = id;
		this.diametro_primitivo = diametro_primitivo;
		this.modulo_normal = modulo_normal;
		this.passo_normal = passo_normal;
		this.circulo_primitivo = circulo_primitivo;
		this.circulo_cabeca = circulo_cabeca;
		this.distancia_eixos_interno = distancia_eixos_interno;
		this.aluno = aluno;
		this.professor = professor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getDiametro_primitivo() {
		return diametro_primitivo;
	}

	public void setDiametro_primitivo(float diametro_primitivo) {
		this.diametro_primitivo = diametro_primitivo;
	}

	public float getModulo_normal() {
		return modulo_normal;
	}

	public void setModulo_normal(float modulo_normal) {
		this.modulo_normal = modulo_normal;
	}

	public float getPasso_normal() {
		return passo_normal;
	}

	public void setPasso_normal(float passo_normal) {
		this.passo_normal = passo_normal;
	}

	public float getCirculo_primitivo() {
		return circulo_primitivo;
	}

	public void setCirculo_primitivo(float circulo_primitivo) {
		this.circulo_primitivo = circulo_primitivo;
	}

	public float getCirculo_cabeca() {
		return circulo_cabeca;
	}

	public void setCirculo_cabeca(float circulo_cabeca) {
		this.circulo_cabeca = circulo_cabeca;
	}

	public float getDistancia_eixos_interno() {
		return distancia_eixos_interno;
	}

	public void setDistancia_eixos_interno(float distancia_eixos_interno) {
		this.distancia_eixos_interno = distancia_eixos_interno;
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
		return Objects.hash(aluno, circulo_cabeca, circulo_primitivo, diametro_primitivo, distancia_eixos_interno, id,
				modulo_normal, passo_normal, professor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultadosEDH other = (ResultadosEDH) obj;
		return Objects.equals(aluno, other.aluno)
				&& Float.floatToIntBits(circulo_cabeca) == Float.floatToIntBits(other.circulo_cabeca)
				&& Float.floatToIntBits(circulo_primitivo) == Float.floatToIntBits(other.circulo_primitivo)
				&& Float.floatToIntBits(diametro_primitivo) == Float.floatToIntBits(other.diametro_primitivo)
				&& Float.floatToIntBits(distancia_eixos_interno) == Float.floatToIntBits(other.distancia_eixos_interno)
				&& Objects.equals(id, other.id)
				&& Float.floatToIntBits(modulo_normal) == Float.floatToIntBits(other.modulo_normal)
				&& Float.floatToIntBits(passo_normal) == Float.floatToIntBits(other.passo_normal)
				&& Objects.equals(professor, other.professor);
	}

	@Override
	public String toString() {
		return "ResultadosEDH [id=" + id + ", diametro_primitivo=" + diametro_primitivo + ", modulo_normal="
				+ modulo_normal + ", passo_normal=" + passo_normal + ", circulo_primitivo=" + circulo_primitivo
				+ ", circulo_cabeca=" + circulo_cabeca + ", distancia_eixos_interno=" + distancia_eixos_interno
				+ ", aluno=" + aluno + ", professor=" + professor + "]";
	}
}
