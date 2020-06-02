package jp.co.internous.easylogin4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.internous.easylogin4.model.form.UserForm;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/")
	public String userindex() {
		return "userindex";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(
			@ModelAttribute("userForm") UserForm form,
			Model model) {
		
		model.addAttribute("userForm", form);
		
		return "register";
	}

}
