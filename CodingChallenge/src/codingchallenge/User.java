/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenge;

/**
 *
 * @author for sale pc
 */
public class User {
    
    int reg, phone;
    String name, surname, gender, email, occu, status;

    /**
     *
     * @param reg
     * @param name
     * @param surname
     * @param gender
     * @param phone
     * @param email
     * @param occu
     * @param status
     */
    public User(int reg,  String name, String surname, String gender, int phone, String email, String occu, String status) {
        this.reg = reg;
        
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.occu = occu;
        this.status = status;
    }

    public int getReg() {
        return reg;
    }

   

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }
     public int getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

    public String getOccu() {
        return occu;
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
