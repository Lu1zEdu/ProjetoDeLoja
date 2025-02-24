package com.br.Ecommerce.Api.controller;

import com.br.Ecommerce.Api.request.UserRequest;
import com.br.Ecommerce.Api.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserResponse userResponse;
    @Autowired
    UserRequest userRequest;

}
