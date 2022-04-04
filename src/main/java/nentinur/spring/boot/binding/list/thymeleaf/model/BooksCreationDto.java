package nentinur.spring.boot.binding.list.thymeleaf.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BooksCreationDto {
    private List<Book> books;

    public BooksCreationDto() {
        this.books = new ArrayList<>();
    }

    public BooksCreationDto(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}