package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Owner;
import com.example.demo.service.OwnerService;

@RestController
@RequestMapping("/owner")
@CrossOrigin("*")
public class OwnerController {

    @Autowired
    private OwnerService service;

    @GetMapping("/")
    public String home() {
        return "Owner Home Page";
    }

    @PostMapping("/addowner")
    public ResponseEntity<String> addOwner(@RequestBody Owner owner) {
        try {
            String output = service.addOwner(owner);
            return ResponseEntity.ok(output);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to add owner!");
        }
    }

    @GetMapping("/viewall")
    public List<Owner> viewAllOwners() {
        return service.viewAllOwners();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOwner(@PathVariable int id) {
        return service.deleteOwner(id);
    }
}
