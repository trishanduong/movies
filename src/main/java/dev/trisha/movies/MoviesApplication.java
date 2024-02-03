/* Declare a package */
package dev.trisha.movies;

/* Import SpringApplication class - which has the method run, which allows us to run the spring application.
* In run, you need to pass the application class to it, and other args */
import org.springframework.boot.SpringApplication;
/* Imports the spring boot annotation   */
/* Annotations let compiler know what the class does */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController /* Annotation that lets the framework know this class is a RestAPI controller */
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/") /* This annotation lets the framework know this method (ApiRoot) is a good endpoint  */
	public String apiRoot  (){
		return "Hello world!";
	}
}
