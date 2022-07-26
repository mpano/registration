/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kenny
 */
@Entity
public class Student {
    @Id
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String course;
    private String gender;
    private String phone;
    private String currentAddress;
    private String email;
    private String password;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
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

    public Student(String FirstName, String MiddleName, String LastName, String course, String gender, String phone, String currentAddress, String email, String password) {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.course = course;
        this.gender = gender;
        this.phone = phone;
        this.currentAddress = currentAddress;
        this.email = email;
        this.password = password;
    }

    public Student() {
    }

//    public Student(String FirstName) {
//        this.FirstName = FirstName;
//    }
    
    
}
