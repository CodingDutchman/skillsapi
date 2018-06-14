package com.objectpartners.vanzante.skillsapi.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mvanzante on 6/13/18.
 */
@Entity
@Data
public class Skill {
    @Id
    @GeneratedValue
    private long id;
    private String type;
    private String name;
}
