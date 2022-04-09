package g12c.cw2.zd5;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

    private static Set<Book> extent = new HashSet<>();
    //Dane
    private Long id;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private List<Integer> borrowCount;
    private boolean isAvailable = true;

    public Book (Long id, String name, Genre genre, Lang language, LocalDate publishDate, int borrowCount, boolean isAvailable){
        setId(id);
        setName(name);
        setGenre(genre);
        setLanguage(language);
        setPublishDate(publishDate);
        this.borrowCount = new ArrayList<>();
        extent.add(this);
    }



    public Long getId(){
        return id;
    }
    public void setId(Long id)  {
        if(id == null){
            try {
                throw new IllegalAccessException("Id can't be empty");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        this.id = id;
    }


    public String getName(){
        return name;
    }
    public void setName(String name) {
        if(name == null){
            try {
                throw new IllegalAccessException ("Name can't be empty");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
    }

    public Genre getGenre(){
        return genre;
    }
    public void setGenre(Genre genre){
        this.genre = genre;
    }


    public Lang getLanguage(){
        return language;
    }
    public void setLanguage(Lang language) {
        this.language = language;
    }

    public LocalDate getPublishDate() throws Exception {
        if(publishDate == null){
            throw new Exception("No data");
        }
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate){
        this.publishDate = publishDate;
    }






    public Period getAge(){
        return Period.between(publishDate,LocalDate.now());
    }









}
