package com.spring.core.chap04;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // 이 Hotel클래스의 객체는 스프링이 관리해라
public class Hotel {

    // 제어의 역전(IoC) : 객체생성의 제어권을 외부로 넘긴다.
    // 의존성 주입(DI) : 외부에서 생성된 객체를 주입받는 개념

    // 레스토랑 객체에 의존
    private Restaurant restaurant;

    // 헤드 쉐프 객체에 의존
    private Chef headChef;

    // 생성자 주입
    @Autowired // 컨테이너에 등록된 객체를 알아서 주입 좀 해줘
    public Hotel(Restaurant restaurant, @Qualifier("kc") Chef headChef) {
        this.restaurant = restaurant;
        this.headChef = headChef;
    }

    public Hotel() {

    }

    // 호텔의 정보를 알려주는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다. 헤드쉐프는 %s입니다.\n"
                , restaurant.getClass().getSimpleName()
                , headChef.getClass().getSimpleName()
        );

        restaurant.order();
    }

}
