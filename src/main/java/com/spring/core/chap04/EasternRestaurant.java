package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EasternRestaurant implements Restaurant {

    // @Autowired 필드에 주입하라라고 하는 건데 이건 테스트에서 생성자 못 쓰기 때문에 있는거. 안쓴다고 봐도됨.
    // 쉐프
    private Chef chef;

    // 요리코스
    private Course course;

    @Autowired // 생성자에 자동 주입해라
    // @Autowired는 세터 주입에 왠만하면 쓰지마라
    public EasternRestaurant(@Qualifier("kc") Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }


    // 요리를 주문하는 기능
    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }

}
