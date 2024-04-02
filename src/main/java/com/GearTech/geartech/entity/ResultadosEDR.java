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
@Table(name="resultado_engrenagem_dentes_retos")
public class ResultadosEDR {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public float d;//circulo primitivo
	public float p; //passo
	public float c; //folga da cabeca
	public float ha; // altura cabeca dente
	public float hf; // altura pe dente
	public float h; //altura dente
	public float da; //circulo cabeca
	public float df; //circulo pe
	public float a; //distecia dos eixos
	public float dai; //circulo da cabeca interno
	public float dfi; //circulo pe interno
	public float ai; // distecia dos eixos interno
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor professor;
	
	public ResultadosEDR() {
	}

	public ResultadosEDR(Long id, float d, float p, float c, float ha, float hf, float h, float da, float df, float a,
			float dai, float dfi, float ai, Aluno aluno, Professor professor) {
		super();
		this.id = id;
		this.d = d;
		this.p = p;
		this.c = c;
		this.ha = ha;
		this.hf = hf;
		this.h = h;
		this.da = da;
		this.df = df;
		this.a = a;
		this.dai = dai;
		this.dfi = dfi;
		this.ai = ai;
		this.aluno = aluno;
		this.professor = professor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public float getD() {
		return d;
	}

	public void setD(float d) {
		this.d = d;
	}

	public float getP() {
		return p;
	}

	public void setP(float p) {
		this.p = p;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getHa() {
		return ha;
	}

	public void setHa(float ha) {
		this.ha = ha;
	}

	public float getHf() {
		return hf;
	}

	public void setHf(float hf) {
		this.hf = hf;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float getDa() {
		return da;
	}

	public void setDa(float da) {
		this.da = da;
	}

	public float getDf() {
		return df;
	}

	public void setDf(float df) {
		this.df = df;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getDai() {
		return dai;
	}

	public void setDai(float dai) {
		this.dai = dai;
	}

	public float getDfi() {
		return dfi;
	}

	public void setDfi(float dfi) {
		this.dfi = dfi;
	}

	public float getAi() {
		return ai;
	}

	public void setAi(float ai) {
		this.ai = ai;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, ai, c, d, da, dai, df, dfi, h, ha, hf, p);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultadosEDR other = (ResultadosEDR) obj;
		return Float.floatToIntBits(a) == Float.floatToIntBits(other.a)
				&& Float.floatToIntBits(ai) == Float.floatToIntBits(other.ai)
				&& Float.floatToIntBits(c) == Float.floatToIntBits(other.c)
				&& Float.floatToIntBits(d) == Float.floatToIntBits(other.d)
				&& Float.floatToIntBits(da) == Float.floatToIntBits(other.da)
				&& Float.floatToIntBits(dai) == Float.floatToIntBits(other.dai)
				&& Float.floatToIntBits(df) == Float.floatToIntBits(other.df)
				&& Float.floatToIntBits(dfi) == Float.floatToIntBits(other.dfi)
				&& Float.floatToIntBits(h) == Float.floatToIntBits(other.h)
				&& Float.floatToIntBits(ha) == Float.floatToIntBits(other.ha)
				&& Float.floatToIntBits(hf) == Float.floatToIntBits(other.hf)
				&& Float.floatToIntBits(p) == Float.floatToIntBits(other.p);
	}

	@Override
	public String toString() {
		return "Resultados [d=" + d + ", p=" + p + ", c=" + c + ", ha=" + ha + ", hf=" + hf + ", h=" + h + ", da=" + da
				+ ", df=" + df + ", a=" + a + ", dai=" + dai + ", dfi=" + dfi + ", ai=" + ai + "]";
	}
}
