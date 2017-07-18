package com.websystique.springmvc.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websystique.springmvc.model.UserLogin;

@Controller

public class IndexController {

	  

	  @RequestMapping( value="/UserManagement" ,method=RequestMethod.GET)
	   public String getLogin(){
		  return "UserManagement";
	  }
	  
	  
	  
	  
	  

	  
	  @RequestMapping(value="/" ,method = RequestMethod.GET)
	    public String getIndexPage() {
	        return "loginForm";
	    }
	 	
	  
	  
	  
}

