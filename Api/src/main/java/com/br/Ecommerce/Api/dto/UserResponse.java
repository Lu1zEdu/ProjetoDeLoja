package com.br.Ecommerce.Api.Dto;

import com.br.Ecommerce.Api.Models.Address;
import com.vaadin.hilla.mappedtypes.Order;

import java.time.LocalDate;
import java.util.List;

public record UserResponse(String firstName, String lastName, String email, String password, LocalDate birthDate, String cpf, String phone,
                           Address address, List<Order> orders) {
}
