package br.com.vitor.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.vitor.dao.ConcursoMongo;
import br.com.vitor.model.Concurso;

@Controller
@Path("/concurso")
public class ConcursoController {

	private ConcursoMongo cm = new ConcursoMongo();

	@Inject
	private Result result;

	@Get("/lista")
	public List<Concurso> lista() {
		return cm.listar();
	}

	@Get("/novo")
	public void novo() {

	}

	@Post("/salvar")
	public void salvar(Integer numeroConcurso, String numeros, String data) {
		cm.inserir(new Concurso(numeroConcurso,
				Date.from(LocalDate
						.of(Integer.valueOf(data.substring(0, 4)), Integer.valueOf(data.substring(5, 7)),
								Integer.valueOf(data.substring(8, 10)))
						.atStartOfDay(ZoneId.systemDefault()).toInstant()),
				numeros));
		result.redirectTo(this).lista();
	}
}
