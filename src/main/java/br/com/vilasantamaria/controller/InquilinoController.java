package br.com.vilasantamaria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.vilasantamaria.model.Inquilino;
import br.com.vilasantamaria.service.InquilinoServiceImpl;

@Controller
public class InquilinoController {
	
	@Autowired
	private InquilinoServiceImpl service;

	@GetMapping("/")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("inquilinos", service.findAll());
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(Inquilino inquilino) {
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("inquilino", inquilino);
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView editar(@PathVariable ("id") Long id,Inquilino inquilino){
	
	return add(service.update(inquilino, id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deletar(@PathVariable ("id") Long id) {
		service.delete(id);
		return findAll();
	}
	
	@PostMapping("/save")
	public ModelAndView save(@Valid Inquilino inquilino, BindingResult result) {
		if(result.hasErrors()) {
			return add(inquilino);
		}
		service.save(inquilino);
		return findAll();
	}
	
	@GetMapping("/buscar")
	public Inquilino buscarPorId(@PathVariable ("id") Long id) {
		return service.findOne(id);
	}
}
