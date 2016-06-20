package com.therealdanvega.repository;

import com.therealdanvega.domain.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, String> {

    Member findById(String id);

    List<Member> findAll();

}
