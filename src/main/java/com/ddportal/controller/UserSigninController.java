package com.ddportal.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserSigninController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    // authentication
    @RequestMapping("/signin")
    public void userSignIn(@RequestParam(value = "error") String error, HttpServletResponse response) throws IOException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        Map<String, Object> data = new HashMap<>();
        data.put("message", "incorrect credentials");
        response.getOutputStream()
        .println(objectMapper.writeValueAsString(data));
    }
}
