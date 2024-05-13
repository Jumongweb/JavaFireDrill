package jsonSerializer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String name;

    @JsonProperty("dob")
    private String dateOfBirth;
    private String phoneNumber;
   private Sex gender;

    public Person(String name, String dateOfBirth, String phoneNumber, Sex gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person----->{name: " + name + " dateOfBirth: " + dateOfBirth + " phoneNumber: " + phoneNumber + " gender: " + gender + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
