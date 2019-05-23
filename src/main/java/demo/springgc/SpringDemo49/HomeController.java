package demo.springgc.SpringDemo49;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// this annotation is required for our controller classes
@Controller // this lets our application know where to look for our methods
public class HomeController {

	// this is helping us let Spring do the dependency injection
	@Autowired
	private Person person;

	// this is how we are calling methods in the controller class
	// @RequestMapping is routing urls for the application
	@RequestMapping("/") // forward slash is referencing your landing page
	public ModelAndView index() {
		int sum = 47 + 69;

		// the ModelAndView object allows us to send information back to our views
		// the first param is the jsp page we want to show, the second param is the name
		// we are using for the EL tag in the jsp page, the third parameter
		// is the java data we want to send back to the page it can be a literal value
		// or any type of object
		ModelAndView mv = new ModelAndView("home", "hello", "Hello, Antonella!");
		// you can add as many things to the page as possible using the addObject method
		mv.addObject("sumOfNums", sum);

		person.setFirstName("Nick");
		person.setLastName("TenBrink");
		mv.addObject("nick", person);

		return mv;
	}

	// post mapping secures the data from the form so that it doesn't 
	// show in the url
	@PostMapping("forminfo")
	// we consume data using request params that match the name attribute
	// in the input fields
	public ModelAndView formDetails(@RequestParam("first") String fName, @RequestParam("last") String lName) {
		Person newPerson = new Person(fName, lName);
		
		return new ModelAndView("newPage", "nP", newPerson);
	}
	
	@RequestMapping("checkbox")
	// we consume data using request params that match the name attribute
	// in the input fields
	public ModelAndView checkboxEx(@RequestParam("bootcamp") String bc) {
		//String[] camps = bc.split(","); // checkboxes with more than one value 
		// will come in as a string of comma separated values
		
		
		return new ModelAndView("newPage", "nP", bc);
	}
	
	

}
