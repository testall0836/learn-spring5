package springPrj.di.annot;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {

	@Value("${myname}")
	private String name;
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("stringPrinter")
	 */
	@Resource(name="${printer1}")
	private Printer printer;
	
	public String getName() {
		return name;
	}

	public Printer getPrinter() {
		return printer;
	}
	
	public String sayHello() {
		return "Hello " + name;
	}
	
	public void print() {
		this.printer.print(sayHello());
	}
}
