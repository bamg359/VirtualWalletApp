package app.domain;

import app.domain.enums.DocumentTypeEnum;

public class Person extends User {


    private String occupation;
    private Double salary;


    public Person() {
        super();
    }

    public Person(Integer id, String name, String lastName, String documentType, String email, String password, String isActive, String occupation, Double salary) {
        super(id, name, lastName, documentType, email, password, isActive);
        this.occupation = occupation;
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person{" +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
