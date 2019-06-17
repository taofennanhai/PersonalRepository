package nchu.class162021.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import nchu.class162021.service.QuestionService;


@Controller
public class HomeController {

	@Autowired
	private QuestionService qs;
	
	@GetMapping("/")
	public String CheckApplyTable(Model model) {
		try {
			List<String> question = qs.RequestQuestion();
		    model.addAttribute("question",question);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return "Main";
	}
	
	@PostMapping("main")
	public String Check(Model model , String ans) {
		String[] list = ans.split(",");
		
		try {
			List<String> question = qs.RequestQuestion();
			List<String> answer = qs.RequestAnswer();
		    model.addAttribute("question",question);
		    model.addAttribute("answer",answer);
		    
		    int c=0;
		    for(int i=0 ; i<list.length ;i++) {
		    	if(answer.equals(answer)) {
		    		c++;
		    	}
		    }
		    System.out.println("·ÖÊý£º "+100*c/answer.size());
		    
		    model.addAttribute("score",100*c/answer.size());
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Main";
	}
	
	
	
	
	
	
}
