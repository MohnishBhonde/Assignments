package com.springBootAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Credit credit;

    @GetMapping(path = "/credit-card/{id}")
    public String creditCard(@PathVariable("id") long number) {
        boolean ans = credit.isValid(number);

        if (ans == true) {
            return "Credit card is valid";
        }
        return "Credit card is not valid";
    }
}