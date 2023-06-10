package com.ddportal.controller;

import com.ddportal.entity.Customer;
import com.ddportal.service.Registration;

@Controller
public class UserSignupController {

    @Autowired
    private Registration registration;

    @RequestMapping(value = "/usersignup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void userSignUp(@RequestBody Customer customer) {
        registration.userSignUp(customer);
    }
}

