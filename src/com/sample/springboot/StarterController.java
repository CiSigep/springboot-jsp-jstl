package com.sample.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StarterController {

	@GetMapping({"/", "/index"})
	public String start(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		
		List<String> forEachList = new ArrayList<String>();
		
		
		forEachList.add("one");
		forEachList.add("two");
		forEachList.add("three");
		forEachList.add("four");
		
		model.addAttribute("forEachList", forEachList);
		
		return "index";
	}
}
