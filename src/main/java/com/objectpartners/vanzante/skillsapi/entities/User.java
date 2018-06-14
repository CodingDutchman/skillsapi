package com.objectpartners.vanzante.skillsapi.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by mvanzante on 6/13/18.
 */
@Entity
@Data
public class User {
    @Id
    public String name;
    @OneToMany
    public Set<Skill> skills;
}
