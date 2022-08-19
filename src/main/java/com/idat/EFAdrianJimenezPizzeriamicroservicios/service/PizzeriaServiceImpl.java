package com.idat.EFAdrianJimenezPizzeriamicroservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFAdrianJimenezPizzeriamicroservicios.model.Pizzeria;
import com.idat.EFAdrianJimenezPizzeriamicroservicios.repository.PizzeriaRepository;

public class PizzeriaServiceImpl implements PizzeriaService{

	@Autowired
	private PizzeriaRepository repository;

	@Override
	public List<Pizzeria> listar() {
		return repository.findAll();
	}


	@Override
	public void guardar(Pizzeria pizzeria) {
		repository.save(pizzeria);
	}



}
