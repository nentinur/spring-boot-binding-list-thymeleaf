package nentinur.spring.boot.binding.list.thymeleaf.model;

import lombok.Data;

@Data
public class Book {
    private long id;

    private String title;

    private String author;
}