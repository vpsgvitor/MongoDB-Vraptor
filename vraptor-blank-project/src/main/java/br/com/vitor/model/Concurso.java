package br.com.vitor.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.bson.types.ObjectId;

public class Concurso {

	ObjectId _id;
	Integer numeroConcurso;
	Date data;
	String numeros;

	public Concurso() {
		super();
	}

	public Concurso(ObjectId id, Integer numeroConcurso, Date data, String numeros) {
		super();
		this._id = id;
		this.numeroConcurso = numeroConcurso;
		this.data = data;
		this.numeros = numeros;
	}

	public Concurso(Integer numeroConcurso, Date data, String numeros) {
		super();
		this.numeroConcurso = numeroConcurso;
		this.data = data;
		this.numeros = numeros;
	}

	public Concurso(String numeros) {
		this.numeros = numeros;
	}

	public ObjectId getId() {
		return _id;
	}

	public void setId(ObjectId id) {
		this._id = id;
	}

	public Integer getNumeroConcurso() {
		return numeroConcurso;
	}

	public void setNumeroConcurso(Integer numeroConcurso) {
		this.numeroConcurso = numeroConcurso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNumeros() {
		return numeros;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}

	public String getDataFormatada() {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}

	public String getNumerosFormatados() {
		return String.valueOf(numeros).replaceAll("\\D+", "");
	}

	@Override
	public String toString() {
		return "Concurso [id=" + _id + ", numeroConcurso=" + numeroConcurso + ", data=" + data + ", numeros=" + numeros
				+ "]";
	}

}
