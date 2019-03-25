package br.com.vitor.dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.bson.types.ObjectId;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import br.com.vitor.conexao.ConexaoMongo;
import br.com.vitor.model.Concurso;

@ApplicationScoped
public class ConcursoMongo implements ConcursoDao {

	private MongoCollection<Concurso> getCollection() {
		return ConexaoMongo.getDataBase().getCollection("Concurso", Concurso.class);
	}

	@Override
	public void inserir(Concurso n) {
		getCollection().insertOne(n);
	}

	@Override
	public void alterar(Concurso n) {
//		getCollection().updateOne(Filters.eq("_id", n.getId()),
//				Updates.combine(Updates.set("titulo", n.getTitulo()), Updates.set("autor", n.getAutor()),
//						Updates.set("descricao", n.getDescricao()),
//						Updates.set("data_publicacao", n.getData_publicacao())));
	}

	@Override
	public List<Concurso> listar() {
		List<Concurso> Concursos = new ArrayList<Concurso>();
		getCollection().find().iterator().forEachRemaining(Concursos::add);
		return Concursos;
	}

	@Override
	public Concurso buscar(ObjectId id) {
		return getCollection().find(Filters.eq("_id", id)).first();
	}

	@Override
	public void remover(ObjectId id) {
		getCollection().deleteOne(Filters.eq("_id", id));
	}
}