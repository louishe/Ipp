package com.missionsky.ipp.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("indexController")
public class IndexController {
	
	@RequestMapping(value="/home")
	public String index()
	{
		return "index";
	}

}
