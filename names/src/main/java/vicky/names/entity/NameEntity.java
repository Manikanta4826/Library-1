package vicky.names.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;






@Document(collection = "NameDetails")

public class NameEntity {

    @Id
    String id;

    String firstName;
    String lastName;
    String gender;
    String noofbooks;

    public NameEntity(String id, String firstName, String lastName, String gender, String noofbooks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.noofbooks = noofbooks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNoofbooks() {
        return noofbooks;
    }

    public void setNoofbooks(String noofbooks) {
        this.noofbooks = noofbooks;
    }
}
