package com.security.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class LoginController {
    final private static Logger LOG = Logger.getGlobal();
    public static final String SECURED_TEXT = "Hello from the secured resource!";

    @GetMapping("/login")
    public void login() {
        LOG.info("GET successfully called on /login resource");
    }

    @GetMapping("/hello")
    public void hello() {
        System.out.println("HelloWorld");
    }
}
