package com.objectpartners.vanzante.skillsapi;

import com.objectpartners.vanzante.skillsapi.entities.User;
import com.objectpartners.vanzante.skillsapi.repository.SkillsRepository;
import com.objectpartners.vanzante.skillsapi.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by mvanzante on 6/13/18.
 */
@RestController
public class SkillsController {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private SkillsRepository skillsRepository;

    @GetMapping(value = "users")
    public Collection<User> getUsersBySkill(@RequestParam String skill) {
        return usersRepository.findBySkillsName(skill);
    }

}
