package com.skilldistillery.jpacrud.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.UnitDAO;
import com.skilldistillery.jpacrud.entities.Unit;

@Controller
public class UnitController {
	@Autowired
	UnitDAO udao;	
	
	@RequestMapping(path="index.do")
	public ModelAndView init() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/index.jsp");
		return mv;
	}
	
	@RequestMapping(path="getUnit.do", method=RequestMethod.GET)
	public ModelAndView getUnit(int id) {
		ModelAndView mv = new ModelAndView();
		Unit u = udao.retrieve(id);
		mv.addObject("unit", u);
		mv.setViewName("WEB-INF/show.jsp");
		return mv;
	}
}
