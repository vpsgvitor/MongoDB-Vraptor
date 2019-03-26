package br.com.vitor.controller;

import java.util.List;

import javax.inject.Inject;

import org.bson.types.ObjectId;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.vitor.dao.ConcursoMongo;
import br.com.vitor.dao.VencedorMongo;
import br.com.vitor.model.Concurso;
import br.com.vitor.model.Vencedor;
import br.com.vitor.service.VencedorService;

@Path("/vencedor")
@Controller
public class VencedorController {

	@Inject
	Result result;

	VencedorMongo vm = new VencedorMongo();
	VencedorService vs = new VencedorService();
	ConcursoMongo cm = new ConcursoMongo();

	@Get("/lista")
	public List<Concurso> lista() {
		return cm.listar();
	}

	@Get("/conferir")
	public List<Concurso> conferir() {
		return cm.listar();
	}

	@Post("/verifica")
	public void verifica(String nome, String numeros, String idConcurso) {
		result.include("mensagem",
				vs.testaNumeros(new Vencedor(nome, numeros, cm.buscar(new ObjectId(idConcurso))))
						? "Parabéns! Você conseguiu!"
						: "Não foi desta vez, tente novamente.");
		result.redirectTo(this).lista();
	}
}
