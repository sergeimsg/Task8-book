package by.itacademy.hw8.classes.task8customer;

import java.io.Serializable;

public class Customer implements Serializable {

   public static final long serialVersionUID = 1L;
          
    int id;
    private String secondName;
    private String firstName;
    private String surname;
    private String address;
    private int idCard;
    private int bankAccaunt;

    public Customer(int id, String secondName, String firstName, String surname, int idCard, int bankAccaunt) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.idCard = idCard;
        this.bankAccaunt = bankAccaunt;
    }

    public Customer(String secondName, String firstName, String surname) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Customer(String secondName, String firstName, String surname, int idCard) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.idCard = idCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getBankAccaunt() {
        return bankAccaunt;
    }

    public void setBankAccaunt(int bankAccaunt) {
        this.bankAccaunt = bankAccaunt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + idCard +
                ", bankAccaunt=" + bankAccaunt +
                '}';
    }
}
