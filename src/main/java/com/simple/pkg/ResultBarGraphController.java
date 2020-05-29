package com.simple.pkg;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultBarGraphController {
	
	
	@GetMapping("/displayBarGraph")
	public String bargraph(Model model){
		Map<String, Integer> resultMap = new LinkedHashMap<String, Integer>();
		resultMap.put("Kanu", 100);
		resultMap.put("Vasu", 100);
		resultMap.put("Manish",80);
		resultMap.put("Seema", 70);
		model.addAttribute("resultMap", resultMap);
		return "barGraph";
		
	}

}
