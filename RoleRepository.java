package com.example.a.Repository;
import com.example.a.Entity.Role;


import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {

	Role saveAll1(Role role);

	Iterable<Role> findAll();

	Role saveAll(Role role);

}
