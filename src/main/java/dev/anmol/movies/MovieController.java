package dev.anmol.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * The words after "@" are annotation in java, they are used to tell the compiler what are the class for.
 * @SpringBootApplication tell's that the class in a spring boot class
 * @RestController tell's that the class will act as a Rest Controller and will have REST API methods like GET, POST, PUT, DELETE and etc.
 * */
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    /*
     * @GetMapping tell's the function will ack as a GET end point in our route handler.
     * */
    @GetMapping
    public ResponseEntity<String> allMovies(){
        return new ResponseEntity<String>("All Movies!", HttpStatus.OK);
    }
}
