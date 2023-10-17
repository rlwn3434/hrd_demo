package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Annotation : 컴파일러에게 설명하기 위한 주석 / @~ // -> 이거는 사람에게 설명하기 위한 주석

public class AudioController {
    @RequestMapping("/audio")    // 링크 위치, http://localhost:8080/ => / 뒤에 더 쓰면 해당 주소로 바뀜.  
    public String home() {
        return "home"; // home.html 작성 필요함. 응답 결과가 HTML
    }

}
