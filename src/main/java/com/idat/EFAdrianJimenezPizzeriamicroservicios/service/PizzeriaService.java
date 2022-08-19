package com.idat.EFAdrianJimenezPizzeriamicroservicios.service;

import java.util.List;

import com.idat.EFAdrianJimenezPizzeriamicroservicios.model.Pizzeria;

public interface PizzeriaService {
	List<Pizzeria> listar();
	void guardar(Pizzeria pizzeria);
}
