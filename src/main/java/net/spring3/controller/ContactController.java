package net.spring3.controller;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import net.spring3.form.Contact;
import net.spring3.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class ContactController {

  @Autowired
  UserService userService;
  
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
							Contact contact, BindingResult result) {
		
		System.out.println("First Name:" + contact.getFirstname() + 
					"Last Name:" + contact.getLastname());
		
		
		return "redirect:contacts.html";
	}
	
	@RequestMapping("/contacts")
	public ModelAndView showContacts(ModelMap modelMap) {
	  NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
	  userService.declare();
	  System.out.println(nf.format(89.584));
	  Currency currency = Currency.getInstance(Locale.JAPAN);
	  modelMap.addAttribute("name", "Manish Agarwal");
	  ModelAndView map = new ModelAndView("contact", "command", new Contact());
	  map.addAllObjects(modelMap);
	  System.out.println("Currency.getSymbol() = " + currency.getSymbol());
		return map;
	}
}
