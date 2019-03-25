package br.com.vitor.dao;

import java.util.List;

import org.bson.types.ObjectId;

import br.com.vitor.model.Vencedor;

public interface VencedorDao {
	public void inserir(Vencedor v);

	public void alterar(Vencedor v);

	public List<Vencedor> listar();

	public Vencedor buscar(ObjectId id);

	public void remover(ObjectId id);

}
