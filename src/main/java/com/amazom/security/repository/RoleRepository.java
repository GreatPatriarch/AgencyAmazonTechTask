package com.amazom.security.repository;

import com.amazom.security.model.ERole;
import com.amazom.security.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
