package nchu.class162021.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import nchu.class162021.service.QuestionService;


@Controller
public class HomeController {

	@Autowired
	private QuestionService qs;
	
	@GetMapping("/")
	public String CheckApplyTable(Model model) {
		try {
			List<String> list = qs.RequestQuestion();
		    model.addAttribute("question",list);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	
		return "Main";
	}
	
	
	
	
	
}
