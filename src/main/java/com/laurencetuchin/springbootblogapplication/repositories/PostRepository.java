package com.laurencetuchin.springbootblogapplication.repositories;

import com.laurencetuchin.springbootblogapplication.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository <Post, Long> {

}
