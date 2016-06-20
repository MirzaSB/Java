package com.therealdanvega.controller;

import com.therealdanvega.domain.Member;
import com.therealdanvega.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    MemberService memberService;

    @RequestMapping("/list")
    @ResponseBody
    public Iterable<Member> list() {
        return memberService.getAllMembers();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Member getMemberById(@PathVariable(value="id") String id) {
        return memberService.findById(id);
    }

}
