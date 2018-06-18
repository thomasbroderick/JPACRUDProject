package com.skilldistillery.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.jpacrud.data.UnitDAO;
import com.skilldistillery.jpacrud.entities.Unit;

@Controller
public class UnitController {
	@Autowired
	UnitDAO udao;

	@RequestMapping(path = "index.do")
	public ModelAndView init() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/index.jsp");
		return mv;
	}

	@RequestMapping(path = "getUnit.do", method = RequestMethod.GET)
	public ModelAndView getUnit(String name) {
		ModelAndView mv = new ModelAndView();
		List<Unit> units = udao.retrieve(name);
		mv.addObject("units", units);
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

	@RequestMapping(path = "createUnit.do", method = RequestMethod.POST)
	public ModelAndView addUnitPost(Unit unit, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		Unit u = udao.create(unit);
		redir.addFlashAttribute("unit", u);
		mv.setViewName("redirect:unitCreated.do");
		return mv;
	}

	@RequestMapping(path = "unitCreated.do", method = RequestMethod.GET)
	public ModelAndView created(Unit unit) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("unit", unit);
		mv.setViewName("WEB-INF/show.jsp");
		return mv;
	}

	@RequestMapping(path = "deleteUnit.do", method = RequestMethod.GET)
	public ModelAndView deleteUnit(int id) {
		ModelAndView mv = new ModelAndView();
		udao.delete(id);
		mv.setViewName("WEB-INF/unitDeleted.jsp");
		return mv;
	}

	@RequestMapping(path = "editUnit.do", method = RequestMethod.GET)
	public ModelAndView editUnit(@RequestParam(name = "id") int id) {
		ModelAndView mv = new ModelAndView();
		Unit u = udao.retrieveById(id);
		mv.addObject("unit", u);
		mv.addObject("id", id);
		mv.setViewName("WEB-INF/editUnit.jsp");
		return mv;
	}

	@RequestMapping(path = "updateUnit.do", method = RequestMethod.POST)
	public ModelAndView updateUnit(Unit unit, int id, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		Unit u = udao.update(id, unit);
		redir.addFlashAttribute("unit", u);
		mv.setViewName("redirect:unitEdited.do");
		return mv;
	}

	@RequestMapping(path = "unitEdited.do", method = RequestMethod.GET)
	public ModelAndView edited(Unit unit) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("unit", unit);
		mv.setViewName("WEB-INF/show.jsp");
		return mv;
	}
}
