package com.hcl.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req,HttpServletResponse res){
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if(user.equals("Uttam")&&pwd.equals("Sharma")){
			return new ModelAndView("success","result","correct credentials");
		}else{
			return new ModelAndView("error","result","Invalid Credentials");
		}
		
	}
}
