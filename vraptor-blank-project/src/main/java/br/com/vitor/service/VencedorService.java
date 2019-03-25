package br.com.vitor.service;

import br.com.vitor.dao.VencedorMongo;
import br.com.vitor.model.Vencedor;

public class VencedorService {

	VencedorMongo vm = new VencedorMongo();

	public boolean testaNumeros(Vencedor v) {
		if (verificaVencedor(v) >= 5) {
			vm.inserir(new Vencedor(v.getNome(), v.getNumeros(), v.getConcurso()));
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