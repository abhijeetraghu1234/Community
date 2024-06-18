package com.example.a.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.a.Entity.Member;


public interface MemberRepository extends CrudRepository<Member,Long>{

}
