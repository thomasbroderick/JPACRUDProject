package com.skilldistillery.jpacrud.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@RequestMapping(path = "addUnit.do", method = RequestMethod.GET)
	public ModelAndView addUnitGet() {
		Unit u = new Unit();
		ModelAndView mv = new ModelAndView();
		mv.addObject("unit", u);
		mv.setViewName("WEB-INF/addUnit.jsp");
		return mv;
	}

	@RequestMapping(path = "addUnit.do", method = RequestMethod.POST)
	public ModelAndView addUnitPost(Unit unit, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		Unit u = udao.create(unit);
		redir.addFlashAttribute("unit", u); 
		mv.setViewName("redirect:unitCreated.do");
		return mv;
	}
	
	@RequestMapping(path="unitCreated.do", method = RequestMethod.GET)
	public ModelAndView created(Unit unit) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("unit", unit);
		mv.setViewName("WEB-INF/show.jsp");
		return mv;
	}
}
