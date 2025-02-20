package com.br.Ecommerce.Api.Controller;

import com.br.Ecommerce.Api.Dto.UserRequest;
import com.br.Ecommerce.Api.Dto.UserResponse;
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
