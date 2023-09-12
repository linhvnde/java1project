//This file is not about defining the structure of the data. Instead, it's about defining the operations we can perform on the data.

package de.linh.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository//is telling Spring (a Java framework) that this interface is meant to be a repository (or in MERN terms, it's kind of like a Mongoose model)
public interface MovieRepository extends MongoRepository<Movie,ObjectId>{

}
