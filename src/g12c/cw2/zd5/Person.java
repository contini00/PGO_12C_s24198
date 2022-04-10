package g12c.cw2.zd5;



import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Adress address;
    private long age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", age=" + age +
                '}';
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null){

            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }


    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname)  {
        if(surname == null){

            throw new RuntimeException ("Surname can't be empty");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        if(dateOfBirth == null){
            throw new RuntimeException("Can't be empty");
        }
        return getDateOfBirth();
    }

    public Person(String name, String surname, LocalDate dateOfBirth, Adress address) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.age = ChronoUnit.YEARS.between(this.dateOfBirth, LocalDate.now());
    }

    public Book publishBook(Long id, String name, Genre genre, Lang language, LocalDate publishDate) {
        List<Person> authors = new ArrayList<>();
        authors.add(this);
        return new Book(id, name, genre, language, publishDate, authors);
    }


}


