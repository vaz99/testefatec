package br.com.api.fatec.api.fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@SpringBootApplication
public class Application {
	
	@RequestMapping("/")
	
	String home() {
		return "hello word";
		
	}
		
		@RequestMapping("/hello")
		
		String home2() {
			return "hello word2 ";
			
		}
        
		@RequestMapping("/numero")
		
		int numero() {
			return 2+3;
		}
		
		@RequestMapping("/numero/{num}")
		
		int numero2(@PathVariable Integer num) {
			return num;
		}
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
