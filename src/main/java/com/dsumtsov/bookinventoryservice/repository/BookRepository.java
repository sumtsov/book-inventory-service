package com.dsumtsov.bookinventoryservice.repository;

import com.dsumtsov.bookinventoryservice.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBooksByTitle(String title);
}
