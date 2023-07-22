package dev.anmol.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/*
* @Document annotation tells compiler that this java class file is a document i.e. a type of modal for our mongodb DB
* @Id tell's that, this property can uniquely identify the document
* @Data take's all the field's data
* @AllArgs & @NoArgs Constructor create a constructor for all the fields
* @DocumentReference tell's that this field will be referencing other Document.
* */
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
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
