package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc") //내가 스프링에게 이름 정의할 수 있음
public class KimuraChef implements Chef {

    public void cook() {
        System.out.println("일식 요리의 대가 키무라입니다.");

    }

}
