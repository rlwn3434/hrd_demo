package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;


@Controller // Annotation : 컴파일러에게 설명하기 위한 주석 / @~ // -> 이거는 사람에게 설명하기 위한 주석
@Slf4j
public class HomeController {
    @RequestMapping("/")    // 링크 위치, http://localhost:8080/ => / 뒤에 더 쓰면 해당 주소로 바뀜.  
    public String home( @RequestParam("pageNo") int pageNo) {
        System.out.println(pageNo);
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        System.out.println("print");
        return "home"; // home.html 작성 필요함. 응답 결과가 HTML
    }
    @RequestMapping({"/home2", "/home"})  // 중복 선택 가능
    public String home2() {
        return "home"; 
    }
    @RequestMapping("/home3")
    @ResponseBody   
    public List<String> home3() {   // List는 타입 써줘야 함
        List<String> list = new ArrayList<>();
        list.add("A");            // A 넣기
        list.add("B");            // B 넣기
        list.add("C");            // C 넣기
        return list;                // 응답 결과가 JSON[]
    }
    

}
