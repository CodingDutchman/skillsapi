package com.objectpartners.vanzante.skillsapi.repository;

import com.objectpartners.vanzante.skillsapi.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by mvanzante on 6/13/18.
 */
public interface SkillsRepository extends JpaRepository<Skill, Long>{
    Collection<Skill> findByType(String type);
    Collection<Skill> findByName(String name);
}
