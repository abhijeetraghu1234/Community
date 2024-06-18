package com.example.a.Service;
import org.springframework.stereotype.Service;

import com.example.a.Entity.Role;

import com.example.a.Repository.RoleRepository;
@Service
public class RoleService {
	private final RoleRepository RoleRepository;
	public  RoleService(RoleRepository RoleRepository) {
		this .RoleRepository=RoleRepository;
}
	public Role saveRole(Role role) {
	return RoleRepository.saveAll(role);
}
	public Iterable<Role> getAllRoles(){
		return ( RoleRepository).findAll();
	}
public void deleteRole(Long Id) {
	RoleRepository.deleteById(Id);
}
}