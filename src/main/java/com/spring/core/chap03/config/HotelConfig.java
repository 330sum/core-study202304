package com.spring.core.chap03.config;

import com.spring.core.chap03.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// <수동으로 빈 등록하는 방법>
// 내가 만든 것만 @Configuration로 사용 가능!
// 근데 남이 만든 것 이렇게 빈 등록해서 사용해야함!


// 이 클래스는 주입에 필요한 객체를 관리하는 클래스
// Configuration - 객체 설정 파일
@Configuration
public class HotelConfig {

    // 빈 등록 : 스프링이 관리할 객체를 알려주는 작업
    @Bean
    public Chef chef() {
        return new JannChef();
    }
    @Bean
    public Course sushiCourse() {
        return new SushiCourse();
    }
    @Bean
    public Course frenchCourse() {
        return new FrenchCourse();
    }
    @Bean
    public Restaurant restaurant() {
        return new WesternRestaurant(chef(), frenchCourse());
    }
    @Bean
    public Hotel hotel() {
        return new Hotel(restaurant(), chef());
    }

}