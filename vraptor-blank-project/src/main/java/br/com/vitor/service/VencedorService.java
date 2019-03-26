package br.com.vitor.service;

import br.com.vitor.dao.ConcursoMongo;
import br.com.vitor.model.Vencedor;

public class VencedorService {

	ConcursoMongo cm = new ConcursoMongo();

	public boolean testaNumeros(Vencedor v) {
		if (verificaVencedor(v) >= 5) {
			cm.addVencedor(v.getConcurso(), v);
			return true;
		} else {
			return false;
		}
	}

	public int verificaVencedor(Vencedor v) {
		int aux = 0;
		for (String s1 : getChar(v.getConcurso().getNumeros())) {
			for (String s2 : getChar(v.getNumeros())) {
				if (s1.equals(s2)) {
					aux++;
				}
			}
		}
		return aux;
	}

	public String[] getChar(String s) {
		return s.split("-");
	}
}