package com.laurencetuchin.springbootblogapplication.repositories;

import com.laurencetuchin.springbootblogapplication.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository <Post, Long> {

    // static search Query - Criteria API not required
    // Search Post title/body for keyword
    @Query("SELECT p FROM Post p WHERE p.title LIKE %?1%"
            + " OR p.body LIKE %?1%")
    public List<Post> search(String keyword);
}
