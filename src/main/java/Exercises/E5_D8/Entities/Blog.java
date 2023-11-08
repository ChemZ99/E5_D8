package Exercises.E5_D7.Entities;

import lombok.Data;

@Data
public class Blog {
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readTime;
}
