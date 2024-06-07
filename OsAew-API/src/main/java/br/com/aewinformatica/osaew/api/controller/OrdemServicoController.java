package br.com.aewinformatica.osaew.api.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ordens-servico")
public class OrdemServicoController {

	@Autowired
	ModelMapper modelMapper;
	
	
}
