package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {

	@RequestMapping("/names")
	public ModelAndView nameDemo(){
		List<String> lst = new ArrayList<String>();
		lst.add("laksh");
		lst.add("delix");
		lst.add("brave");
		lst.add("garani");
		lst.add("zairvi");
		return new ModelAndView("ShowPage","lists",lst);
		
	}
}
