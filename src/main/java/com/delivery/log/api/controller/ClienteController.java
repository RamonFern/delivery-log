package com.delivery.log.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.log.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Pedro Raulzito");
		cliente1.setEmail("raul@emmail.com.br");
		cliente1.setTelefone("98 97019-3740");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Sophia fernandes");
		cliente2.setEmail("sophia@emmail.com.br");
		cliente2.setTelefone("98 98766-3054");
		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
