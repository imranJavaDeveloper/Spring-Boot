package com.example.CRUD_Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepositroy extends JpaRepository<Book,Long> {
}
