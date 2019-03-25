package br.com.vitor.model;

import org.bson.types.ObjectId;

public class Vencedor {
	ObjectId _id;
	String nome;
	String numeros;
	Concurso concurso;

	public Vencedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vencedor(String nome, String numeros, Concurso concurso) {
		super();
		this.nome = nome;
		this.concurso = concurso;
		this.numeros = numeros;
	}

	public ObjectId getId() {
		return _id;
	}

	public void setId(ObjectId id) {
		this._id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Concurso getConcurso() {
		return concurso;
	}

	public void setConcurso(Concurso concurso) {
		this.concurso = concurso;
	}

	public String getNumeros() {
		return numeros;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}

}