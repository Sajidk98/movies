package com.example.movies.Repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movies.modals.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
