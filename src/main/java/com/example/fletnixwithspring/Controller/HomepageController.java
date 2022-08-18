package com.example.fletnixwithspring.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/credentials")
    public String getCredentialsPage(){
        return "credentialsPage";
    }

    @GetMapping("/user")
    public String getUserPage(){
        return "userPage";
    }

}
