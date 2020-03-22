package springPrj.di.annot;

import org.springframework.stereotype.Component;

@Component("stringPrinter")
public class StringPrinter implements Printer {

	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void print(String message) {
		buffer.append(message);
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return this.buffer.toString();
	}

}
