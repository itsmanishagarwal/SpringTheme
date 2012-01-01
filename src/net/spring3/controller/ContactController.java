package net.spring3.controller;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import net.spring3.form.Contact;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class ContactController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
							Contact contact, BindingResult result) {
		
		System.out.println("First Name:" + contact.getFirstname() + 
					"Last Name:" + contact.getLastname());
		
		
		return "redirect:contacts.html";
	}
	
	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
	  NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
	  
	  System.out.println(nf.format(89.584));
	  Currency currency = Currency.getInstance(Locale.JAPAN);
	  System.out.println("Currency.getSymbol() = " + currency.getSymbol());
		return new ModelAndView("contact", "command", new Contact());
	}
}
