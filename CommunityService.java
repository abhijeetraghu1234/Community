package com.example.a.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.a.Entity.Community;

import com.example.a.Repository.CommunityRepository;

@Service
public class CommunityService {
private final CommunityRepository CommunityRepository;

public CommunityService(CommunityRepository CommunityRepository) {
	this.CommunityRepository = CommunityRepository;
}

private Object getAllCommunitys() {
	// TODO Auto-generated method stub
	return null;
}
public void getAllCommunity() {
	return;
	}
}