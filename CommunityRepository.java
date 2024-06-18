package com.example.a.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.a.Entity.Community;
public interface CommunityRepository extends CrudRepository<Community,Long> {

	Iterable<Community> saveAll(List<Community> allCommunity);

	

	void deleteById(Long id)

	Optional<Community> findById(Long id);



}
