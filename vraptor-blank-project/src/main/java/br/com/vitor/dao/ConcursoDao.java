package br.com.vitor.dao;

import java.util.List;
import org.bson.types.ObjectId;
import br.com.vitor.model.Concurso;

public interface ConcursoDao {

	public void inserir(Concurso n);

	public void alterar(Concurso n);

	public List<Concurso> listar();

	public Concurso buscar(ObjectId id);

	public void remover(ObjectId id);
}
