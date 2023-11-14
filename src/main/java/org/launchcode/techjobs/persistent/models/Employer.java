package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @OneToMany
    @JoinColumn (name = "employer_id")
    public List<Job> jobs = new ArrayList<>();



    @NotBlank(message="Name is required.")
    @Size(min= 3, max = 100, message = "Name must be between 3 and 100 characters.")
    String location;

    public Employer(){

    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}

