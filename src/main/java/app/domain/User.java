package app.domain;

import app.domain.enums.DocumentTypeEnum;

public class User {

    private Integer id;
    private String name;
    private String lastName;
    private String documentType;
    private String email;
    private String password;
    private String state;

    public User() {
    }


    public User(Integer id, String name, String lastName, String documentType, String email, String password, String isActive) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.documentType = documentType;
        this.email = email;
        this.password = password;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String isState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentType=" + documentType +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
}
