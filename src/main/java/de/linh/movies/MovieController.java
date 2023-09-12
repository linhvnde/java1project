package de.linh.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController//An annotation that tells Spring that this class will handle HTTP requests as a RESTful controller.@RestController is akin to indicating, "This is a route handler file" like the Movies.Routes.js
//in RESTApi there are multiple layers, one of them is API layer which is this MovieController class, concerns getting request from the User and returning a response (using a service class and fetching data from database and giving it back to it
@RequestMapping("/api/v1/movies")// annotation that sets the base URL path for this controller. All methods in this class will have this as their root path.router.use('/api/v1/movies', Movies.Routes);
public class MovieController {//defines a new public class like defining a new module or a new set of routes in an Express.js app
    @Autowired//to reference to service class: defining a variable to hold a reference to some module or service you've imported, e.g., const movieService = require('./movieService');.
    private MovieService movieService;
    @GetMapping//control get request - like when you define a route like router.get('/', (req, res) => {...});, you're saying the function will handle GET requests to that route.
    public ResponseEntity<List<Movie>> getAllMovies(){//public method named getAllMovies. When called, it will return a ResponseEntity with a type of String.
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);//HttpStatus OK means 200 - like saying res.status(200).json('All Movies Here!');.
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSinngleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
