package com.example.a.Repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.a.Entity.User;
public interface UserRepository extends CrudRepository<User,Long> {

	List<User> findAll();

	List<User> findAll1();



	

}
