//This file is not about defining the structure of the data. Instead, it's about defining the operations we can perform on the data.

package de.linh.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository//is telling Spring (a Java framework) that this interface is meant to be a repository (or in MERN terms, it's kind of like a Mongoose model)
public interface MovieRepository extends MongoRepository<Movie,ObjectId>{
//this repository layer is kind of the data access layer for our API, it does the job of talking to the database and getting the data back

    //now find movie by imdbId
    Optional<Movie> findMovieByImdbId(String imdbId);
}
