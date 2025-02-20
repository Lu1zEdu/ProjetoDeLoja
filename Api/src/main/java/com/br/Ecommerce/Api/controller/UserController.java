package com.br.Ecommerce.Api.controller;

import com.br.Ecommerce.Api.dto.UserRequest;
import com.br.Ecommerce.Api.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserResponse userResponse;
    @Autowired
    UserRequest userRequest;

}
