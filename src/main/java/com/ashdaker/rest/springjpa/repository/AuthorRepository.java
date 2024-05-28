package com.ashdaker.rest.springjpa.repository;

import com.ashdaker.rest.springjpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // select * from author where first_name = 'purvesh'
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name = 'purvesh'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // select * from author where first_name like '%pu%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    // select * from author where first_name like 'pu%'
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

    // select * from author where first_name like '%pu'
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    // select * from author where first_name in ('purvesh', 'dhaker', 'ashdhaker')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
