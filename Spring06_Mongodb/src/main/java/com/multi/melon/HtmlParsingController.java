package com.multi.melon;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlParsingController {
    
    @GetMapping("/map")
    public String showMapPage() {
    	//List<XXVO> list =
    	//model.addAttribute("jsonData", jsonData);
        return "map"; // 매핑된 뷰 이름 (map.jsp 또는 map.html)
    }
}