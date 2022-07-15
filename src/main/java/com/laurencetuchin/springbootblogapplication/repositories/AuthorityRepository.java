package com.laurencetuchin.springbootblogapplication.repositories;

import com.laurencetuchin.springbootblogapplication.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {


}
