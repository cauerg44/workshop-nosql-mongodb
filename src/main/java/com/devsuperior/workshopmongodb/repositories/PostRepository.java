package com.devsuperior.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.workshopmongodb.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}