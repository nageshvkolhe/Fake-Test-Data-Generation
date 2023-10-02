import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class FakeDataGenerator {
	public static void main(String args[]) {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		System.out.println("First Name : " + firstName);
		String lastName = faker.name().lastName();
		System.out.println("Last Name : " + lastName);
		String fullName = faker.name().fullName();
		System.out.println("Full Name : " + fullName);
		String address = faker.address().streetAddress();
		System.out.println("Street Address :" + address);
		String city = faker.address().city();
		System.out.println("City :" + city);
		String phoneNumber = faker.phoneNumber().phoneNumber();
		System.out.println("PhoneNumber : " + phoneNumber);
		String email = faker.internet().emailAddress();
		System.out.println("Email : " + email);

		System.out.println("*********** India Specific Data **************");
		// To generate India Specific data
		Locale locale = new Locale("en-IND");
		Faker fake = new Faker(locale);
		String FirstName = fake.name().firstName();
		System.out.println("First Name : " + FirstName);
		String LastName = fake.name().lastName();
		System.out.println("Last Name : " + LastName);
		String FullName = fake.name().fullName();
		System.out.println("Full Name : " + FullName);
		String Address = fake.address().streetAddress();
		System.out.println("Street Address :" + Address);
		String City = fake.address().city();
		System.out.println("City :" + City);
		String PhoneNumber = fake.phoneNumber().phoneNumber();
		System.out.println("PhoneNumber : " + PhoneNumber);
		String Email = fake.internet().emailAddress();
		System.out.println("Email : " + Email);
	}
}