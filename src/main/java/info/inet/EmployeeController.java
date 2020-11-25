package info.inet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/emp")
public class EmployeeController {
	@RequestMapping(method = RequestMethod.GET,produces="Application/Xml" )
	public Employee display(Integer eno,String ename) {
		return new Employee(100,"sai");
		
	}

}
