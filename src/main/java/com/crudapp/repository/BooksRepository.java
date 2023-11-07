package com.crudapp.repository;
import org.springframework.data.repository.CrudRepository;

import com.crudapp.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
