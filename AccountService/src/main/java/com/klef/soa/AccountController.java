
package com.klef.soa;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/internal/accounts")
public class AccountController {

    @GetMapping
    public String getAccounts() {
        return "Account Service is running";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable int id) {
        return "Account Details for ID: " + id;
    }
}
