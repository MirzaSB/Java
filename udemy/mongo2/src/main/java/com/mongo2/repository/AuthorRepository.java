package com.mongo2.repository;

import com.mongo2.domain.Author;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface AuthorRepository extends CrudRepository<Author, BigInteger> {

}