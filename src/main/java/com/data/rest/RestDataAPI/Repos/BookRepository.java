package com.data.rest.RestDataAPI.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.data.rest.RestDataAPI.Entities.Book;

@Repository
@RepositoryRestResource(path = "books",collectionResourceRel = "book")
public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
