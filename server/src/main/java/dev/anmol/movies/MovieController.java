package dev.anmol.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
 * The words after "@" are annotation in java, they are used to tell the compiler what are the class for.
 * @SpringBootApplication tell's that the class in a spring boot class
 * @RestController tell's that the class will act as a Rest Controller and will have REST API methods like GET, POST, PUT, DELETE and etc.
 * */
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/v1/movies")
public class MovieController {


    @Autowired
    private MovieService movieService;

    /*
     * @GetMapping tell's the function will ack as a GET end point in our route handler.
     * */
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);
    }
}
