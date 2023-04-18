package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("jc") //내가 스프링에게 이름 정의할 수 있음
public class JannChef implements Chef {

    public void cook() {
        System.out.println("프랑스 요리의 대가 쟝입니다.");
    }

}
