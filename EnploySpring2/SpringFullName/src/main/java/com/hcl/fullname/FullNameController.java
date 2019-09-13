package com.hcl.fullname;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FullNameController {
		@RequestMapping("/full")
		public ModelAndView calc(HttpServletRequest req, HttpServletResponse res){
			String first,second;
			first = req.getParameter("firstName");
			second = req.getParameter("secondName");
			String third = first + " " + second;
			return new ModelAndView("result","message",third);
		}
}
