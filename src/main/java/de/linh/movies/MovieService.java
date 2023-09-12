package de.linh.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();//this service does is use the movieRepo and talk to the database and return to the movie Api layer
    }
    public Optional<Movie> singleMovie(String imdbId){//Optional<Movie> because it can return null if cannot find any result
        return movieRepository.findMovieByImdbId(imdbId);//this is not built in method but self made method in MovieRepository
    }

}
