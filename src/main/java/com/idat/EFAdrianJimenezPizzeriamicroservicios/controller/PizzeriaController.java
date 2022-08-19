package com.idat.EFAdrianJimenezPizzeriamicroservicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFAdrianJimenezPizzeriamicroservicios.model.Pizzeria;
import com.idat.EFAdrianJimenezPizzeriamicroservicios.service.PizzeriaService;

@Controller
@RequestMapping("/api/pizzeria/v1")
public class PizzeriaController {

	@Autowired
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Pizzeria pizzeria) {
		service.guardar(pizzeria);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	

}
