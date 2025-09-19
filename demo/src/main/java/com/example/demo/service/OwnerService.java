package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Owner;

public interface OwnerService {

    public String addOwner(Owner owner);

    public List<Owner> viewAllOwners();

    public String deleteOwner(int id);
}
