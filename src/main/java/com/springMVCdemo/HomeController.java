package com.springMVCdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class HomeController {
	@RequestMapping(value="/")  
	public String demo()  
    {  
        return "index";  
    } 
	@RequestMapping(value="/result", method=RequestMethod.GET) 
	public ModelAndView result(HttpServletRequest req, HttpServletResponse res) 	
	{
		Integer a = Integer.parseInt(req.getParameter("a"));
		Integer b = Integer.parseInt(req.getParameter("b"));
		String operation = req.getParameter("operation");
		Integer c = null;
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.springMVCdemo");
		context.refresh();		
		
		HomeService hs = context.getBean(HomeService.class);
		if(operation.equals("+")) {
			c = hs.add(a, b);
		} else if(operation.equals("-")) {
			c = hs.sub(a, b);
		} else if(operation.equals("*")) {
			c = hs.mul(a, b);
		} else if(operation.equals("/")) {
			c = hs.div(a, b);
		}	
		
		//System.out.println(a+" "+b);
		ModelAndView mv = new ModelAndView();
		mv.addObject("a", a);
		mv.addObject("b", b);
		mv.addObject("c", c);
		mv.setViewName("result");
		
		context.close();
		return mv;
	}
	/*
	public ModelAndView result(@RequestParam("a") String a, @RequestParam("b") String b)  
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("a", a);
		mv.addObject("b", b);
		return mv;
	}
    public String result(@RequestParam("a") String a, @RequestParam("b") String b)  
    {  
		System.out.println(a+" "+b);
        return "result";  
    }
    */
}  
