package com.example.a.Service;

import java.util.List;
import java.util.Optional;

import com.example.a.Entity.Member;
import com.example.a.Repository.MemberRepository;

public class MemberService {
private final MemberRepository MemberRepository;
	
	public MemberService(MemberRepository MemberRepository) {
		this.MemberRepository = MemberRepository;
	}
	public Member saveMember(Member Member) {
		return MemberRepository.save(Member);
	}
	public List<Member> getAllMembers() {
		return (List<Member>) MemberRepository.findAll();
	}
	public Optional<Member> getMemberById(Long Id) {
		return MemberRepository.findById(Id);
	}
	public void deleteMember(Long Id) {
		MemberRepository.deleteById(Id);
	}
}
	

