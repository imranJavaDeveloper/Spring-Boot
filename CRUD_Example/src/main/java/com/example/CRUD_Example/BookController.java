package com.example.CRUD_Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return bookService.findById(id);
    }


    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,@RequestBody Book bookDetail){
          Book book= bookService.findById(id).orElseThrow();
            book.setAuthor(bookDetail.getAuthor());
            book.setId(bookDetail.getId());
            book.setPage(bookDetail.getPage());
            book.setPrice(bookDetail.getPrice());
            book.setTittle(bookDetail.getTittle());
            return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.findById(id);
    }



    // New method to demonstrate @RequestParam
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String author) {
        return bookService.searchBooks(title, author);
    }

}
