package com.br.Ecommerce.Api.dto;

import com.br.Ecommerce.Api.models.Address;
import com.br.Ecommerce.Api.models.Ordered;

import java.time.LocalDate;
import java.util.List;

public record UserResponse(String firstName, String lastName, String email, String password, LocalDate birthDate, String cpf, String phone,
                           Address address, List<Ordered> orders) {
}
