package com.objectpartners.vanzante.skillsapi.repository;

import com.objectpartners.vanzante.skillsapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by mvanzante on 6/13/18.
 */
public interface UsersRepository extends JpaRepository<User, String> {
    Collection<User> findBySkillsName(String name);
    Collection<User> findBySkillsType(String type);
}
