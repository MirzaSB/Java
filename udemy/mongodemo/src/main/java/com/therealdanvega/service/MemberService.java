package com.therealdanvega.service;

import com.therealdanvega.domain.Member;

import java.util.List;

public interface MemberService {

    List<Member> getAllMembers();

    Member findById(String id);

}
