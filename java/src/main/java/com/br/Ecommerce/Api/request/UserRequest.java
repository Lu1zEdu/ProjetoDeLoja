package com.br.Ecommerce.Api.request;

import com.br.Ecommerce.Api.enums.TypeUser;
import com.br.Ecommerce.Api.models.Address;
import com.br.Ecommerce.Api.models.Order;

import java.time.LocalDate;
import java.util.List;


public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthDate;
    private String cpf;
    private String phone;
    private Address address;
    private List<Order> orders;
    private TypeUser typeUser;

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
}
