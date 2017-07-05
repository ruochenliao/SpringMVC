package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.Login;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	  @RequestMapping(method=RequestMethod.GET)
	  public String userLogin(Model model) {
	    model.addAttribute(new Login());
	    return "login";
	  }
	  
	  @RequestMapping(method=RequestMethod.POST)
	  public String processLogin(
	      @Valid Login login, 
	      Errors errors) {
	    if (errors.hasErrors()) {
	      return "login";
	    }
	    
	    //else if ( spitterRepository.findByUsernameAndPassword(login.getUserName(), login.getPassword() )== null ){
	    //	return "login";
	    //}
	    
	    else{
	    	return "redirect:/spitter/" + login.getUserName();
	    }
	  }
	  
}
