package g12c.cw2.zd5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

    //Dane
    private Long id;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private long age;
    private int borrowCount;
    private List<Person> authors;
    private boolean isAvailable;
    private Person borrowing;

    @Override
    public String toString(){
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", language=" + language +
                ", publishDate=" + publishDate +
                ", age=" + age +
                ", borrowCount=" + borrowCount +
                ", isAvailable=" + isAvailable +
                ", authors=" + authors +
                ", borrowing=" + borrowing +
                '}';
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

    /*public Period getAge(){
        return Period.between(publishDate,LocalDate.now());
    }
    */

    static List<Book> booksList = new ArrayList<>();

    public static void addNewBook(Book book) {
        booksList.add(book);
    }

    public static List<Book> getBooksList(){
        return booksList;
    }

    public Book(Long id, String name, Genre genre, Lang language, LocalDate publishDate, List<Person> authors){
        this.id = id;
        this.name = name;
        this. genre = genre;
        this.language = language;
        this.publishDate = publishDate;
        this.age = ChronoUnit.YEARS.between(this.publishDate, LocalDate.now());
        this.borrowCount = 0;
        this.authors = authors;
        this.isAvailable = true;
        booksList.add(this);
    }

    public Book(Long id, String name, Genre genre, Lang language,List<Person> authors){
        this.id = id;
        this.name = name;
        this. genre = genre;
        this.language = language;
        this.publishDate = publishDate;
        this.age = ChronoUnit.YEARS.between(this.publishDate, LocalDate.now());
        this.borrowCount = 0;
        this.authors = authors;
        this.isAvailable = true;
        booksList.add(this);






}
