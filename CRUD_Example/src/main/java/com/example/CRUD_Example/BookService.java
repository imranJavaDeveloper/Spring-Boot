package com.example.CRUD_Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    private BookRepositroy bookRepositroy;

    public List<Book> findAll(){
        return bookRepositroy.findAll();
    }

    public Optional<Book> findById(Long id){
        return bookRepositroy.findById(id);
    }

   public Book save(Book book){
        return bookRepositroy.save(book);
   }

   public void deleteById(Long id){
        bookRepositroy.deleteById(id);
   }

    public List<Book> searchBooks(String title, String author) {
        return bookRepositroy.findAll().stream()
                .filter(book -> (title == null || book.getTittle().contains(title)) &&
                        (author == null || book.getAuthor().contains(author)))
                .collect(Collectors.toList());
    }
}
