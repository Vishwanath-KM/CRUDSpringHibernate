package com.vishu.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vishu.services.ActorService;

@Controller
public class AppController {

	@Autowired
	ActorService service;

	@RequestMapping({ "/", "/home" })
	public String showHome() {
		System.out.println("in AppC->showHome()");
		return "Home";
	}

	@RequestMapping("/displayActors")
	public String showActors(Model m) {
		List<Actor> actors = service.listActors();
		m.addAttribute("listActors", actors);
		return "DisplayActors";

	}

	@RequestMapping("/openAddActorView")
	public String showAddActors(Model model) {
		model.addAttribute("actor", new Actor());
		return "AddActor";
	}

	@RequestMapping("addActor")
	public String addActor(@ModelAttribute("actor") @Valid Actor bean, BindingResult result, Model model) {
		System.out.println("actor = " + bean);
		if (result.hasErrors()) {
			return "AddActor";
		} else {
			String msg = service.createActor(bean);
			model.addAttribute("msg", msg);
			return "Success";
		}
	}

	@RequestMapping("/deleteActor")
	public String deleteActor(Long sl, Model m) {
		String msg = service.deleteActor(sl);
		m.addAttribute("msg", msg);
		return "Success";
	}

	@RequestMapping("openUpdateActor")
	public String showActorUpdate(Long sl, Model m) {
		Actor actor = service.getActor(sl);
		//System.out.println(actor);
		
		m.addAttribute("act", actor);

		return "EditActor";

	}

	@RequestMapping("updateActor")
	public String updateActor(Long sl,Actor bean, Model m) {
		Actor actor = service.getActor(sl);
		//bean.setSl(sl);
		System.out.println("actor = " + actor);
		System.out.println("bean"+bean);
		String msg = service.updateActor(bean);
		m.addAttribute("msg", msg);
		return "Success";

	}
}
