package g12c.cw6.zd1;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person(String name, String surname, LocalDate dateOfBirth) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            throw new RuntimeException("Cannot be empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.isEmpty()){
            throw new RuntimeException("Cannot be empty");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth==null) {
            throw new RuntimeException("Cannot be empty");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getAgeInYears() {
        return LocalDate.now().getYear()-dateOfBirth.getYear();
    }

    public abstract double getIncome();
}

//=================================================

class Employee extends Person{
    private double salary;

    public Employee(String name, String surname, LocalDate dateOfBirth, double salary) {
        super(name, surname, dateOfBirth);

        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(){
        if(salary <=0){
            throw new RuntimeException("Must be higher then 0 ");
        }
        this.salary=salary;
    }

    @Override
    public double getIncome(){
        return salary-(salary*20/100);
    }
}

class Student extends Person{
    private double scholarship;

    public Student (String name, String surname, LocalDate dateOfBirth, double scholarship){
        super(name, surname, dateOfBirth);

        this.scholarship=scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        if(scholarship <=0){
            throw new RuntimeException("Must be higer than zero");
        }
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome(){
        return scholarship;
    }
}
