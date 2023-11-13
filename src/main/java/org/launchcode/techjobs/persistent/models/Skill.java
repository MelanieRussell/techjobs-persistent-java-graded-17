package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Skill extends AbstractEntity {

    public Skill(){

    }
    @Size(min= 3, max = 100, message = "Description must be between 3 and 100 characters.")
    public Skill(String description){
        super();
        this.description = description;
    }

    @Size(min= 3, max = 100, message = "Description must be between 3 and 100 characters.")
   String description;
    @ManyToMany(mappedBy="skills")
    @NotNull
    private List<Job> jobs = new ArrayList<>();
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }


    public List<Job> getJobs() {
        return jobs;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
