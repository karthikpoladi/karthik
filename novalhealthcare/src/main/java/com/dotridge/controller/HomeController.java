/**
 * 
 */
package com.dotridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dotridge.beans.LoginBean;
import com.dotridge.beans.ManageUserProfileBean;

/**
 * @author ALWAR
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/home")
	public String getHomePage() {
		return "home";
	}

	@RequestMapping("/getLoginPage")
	public String getLoginPage(Model model) {
		model.addAttribute("loginBean", new LoginBean());
		return "login";

	}

	@RequestMapping(value = "/login")
	public String doLoginPage(@ModelAttribute("loginBean") LoginBean loginBean) {
		String username = loginBean.getUserId();
		boolean result = (username != null && username
				.equalsIgnoreCase("superadmin@gmail.com")) ? true : false;
		if (result) {
			return "getSuperAdminBoard";
		}
		else 
			return "login";
	}

	@RequestMapping(value = "/getSignUpPage")
	public String getSignupPage(Model model) {
		model.addAttribute("manageUserProfileBean", new ManageUserProfileBean());
		return "register";
	}

	@RequestMapping(value = "/register")
	public String doSignUpPage(
			@ModelAttribute("manageUserProfileBean") ManageUserProfileBean manageUserProfileBean) {
		System.out.println(manageUserProfileBean.toString());
		return "register";
	}
}
