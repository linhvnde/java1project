//This file is defining the structure (or shape) of the data. It's similar to how you'd define a Mongoose schema in JavaScript.

package de.linh.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import javax.swing.plaf.BorderUIResource;
import java.util.List;

@Document(collection = "collections1")//this notation to note this class presents each document in the movies collections ** the collection name needs to be the collection name in mongodb
@Data//take care of getter setter and toString methods
@AllArgsConstructor//creating a Constructor that takes all the private fields/variables as args
@NoArgsConstructor//Constructor takes no args
public class Movie {
    @Id//let the framework know that this properties should be treated as the unique id for each movie in the database
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
