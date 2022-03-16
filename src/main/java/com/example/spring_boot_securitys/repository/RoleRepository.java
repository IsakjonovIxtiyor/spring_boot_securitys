package com.example.spring_boot_securitys.repository;

import com.example.spring_boot_securitys.entity.Role;
import com.example.spring_boot_securitys.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    List<Role> findAllByName(RoleName name);
}
