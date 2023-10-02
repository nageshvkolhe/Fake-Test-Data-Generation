import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class FakerDemo {
	public static void main(String[] agrs) {
		Faker faker = new Faker();
		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-US"), new RandomService());
		// regexify: to generate random sequences of alphabetic characters.
		String alphanumericString = fakeValuesService.regexify("[a-z]{10}");
		System.out.println("alphanumericString : " + alphanumericString);
		
	//Generating Fake Data
		String email = fakeValuesService.bothify("??????##@gmail.com");
		System.out.println(email);
	}
}
