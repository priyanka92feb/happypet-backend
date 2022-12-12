package com.lab.websec.backend.api.newpetstuff.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.websec.backend.model.Role;
import com.lab.websec.backend.model.RoleEnum;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleEnum name);
}