package br.com.vitor.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import br.com.vitor.conexao.ConexaoMongo;
import br.com.vitor.model.Vencedor;

public class VencedorMongo implements VencedorDao {
	private MongoCollection<Vencedor> getCollection() {
		return ConexaoMongo.getDataBase().getCollection("Vencedor", Vencedor.class);
	}

	@Override
	public void inserir(Vencedor v) {
		getCollection().insertOne(v);
	}

	@Override
	public void alterar(Vencedor v) {
//		getCollection().updateOne(Filters.eq("_id", n.getId()),
//				Updates.combine(Updates.set("titulo", n.getTitulo()), Updates.set("autor", n.getAutor()),
//						Updates.set("descricao", n.getDescricao()),
//						Updates.set("data_publicacao", n.getData_publicacao())));
	}

	@Override
	public List<Vencedor> listar() {
		List<Vencedor> vencedores = new ArrayList<Vencedor>();
		getCollection().find().iterator().forEachRemaining(vencedores::add);
		return vencedores;
	}

	@Override
	public Vencedor buscar(ObjectId id) {
		return getCollection().find(Filters.eq("_id", id)).first();
	}

	@Override
	public void remover(ObjectId id) {
		getCollection().deleteOne(Filters.eq("_id", id));
	}

}
