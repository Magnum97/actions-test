package hello;

import java.time.LocalTime;

public class HelloWorld {

	public static void main (String[] args) {
		LocalTime currentTime = LocalTime.now();


		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
		System.out.println("The current local time is: " + currentTime);
	}
}
