package com.multi.melon;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlParsingController {
    
    @GetMapping("/map")
    public String showMapPage() {
    	//List<XXVO> list =
    	//model.addAttribute("jsonData", jsonData);
        return "map"; // ���ε� �� �̸� (map.jsp �Ǵ� map.html)
    }
}