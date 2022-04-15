package br.edu.universidadedevassouras.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.universidadedevassouras.model.Leiturista;
import br.edu.universidadedevassouras.reository.LeituristaRepository;

@RestController
@RequestMapping("/leiturista")
public class LeituristaController {
	
	@Autowired
	private LeituristaRepository leituristaRepository;

	@PostMapping
	private Leiturista adicionar(@RequestBody Leiturista leiturista) {
		return leituristaRepository.save(leiturista);
	}
	
	@GetMapping
	private List<Leiturista> listar() {
		return leituristaRepository.findAll();
	}
	
	@DeleteMapping
	private void deletar() {
		leituristaRepository.deleteAll();
	}
	
}
