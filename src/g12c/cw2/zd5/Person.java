package g12c.cw2.zd5;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public String getName(){
        return name;
    }
    public void setName(String name) throws IllegalAccessException {
        if(name == null){

            throw new IllegalAccessException ("Name can't be empty");
        }
        this.name = name;
    }


    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname) throws IllegalAccessException {
        if(surname == null){

            throw new IllegalAccessException ("Surname can't be empty");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() throws Exception {
        if(dateOfBirth == null){
            throw new Exception("Can't be empty");
        }
        return getDateOfBirth();
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }


}


