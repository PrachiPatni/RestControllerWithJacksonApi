package in.prachi;

import java.io.IOException;
import java.io.File;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) throws Exception, DatabindException, IOException {
		Customer c = new Customer(101, "Prachi", "prachi@gmail.com");

		// Convert object to json Format Jackson Api provided one class called
		// ObjectMapper
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("completed..");
	}
}
