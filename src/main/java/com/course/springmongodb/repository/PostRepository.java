package com.course.springmongodb.repository;

import com.course.springmongodb.domain.Post;
import com.course.springmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
