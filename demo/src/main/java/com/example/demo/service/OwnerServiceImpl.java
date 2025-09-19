package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Owner;
import com.example.demo.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository repository;

    @Override
    public String addOwner(Owner owner) {
        repository.save(owner);
        return "Owner added successfully";
    }

    @Override
    public List<Owner> viewAllOwners() {
        return repository.findAll();
    }

    @Override
    public String deleteOwner(int id) {
        Optional<Owner> object = repository.findById(id);
        String msg;
        if (object.isPresent()) {
            Owner owner = object.get();
            repository.delete(owner);
            msg = "Owner deleted successfully";
        } else {
            msg = "Owner ID not found";
        }
        return msg;
    }
}
