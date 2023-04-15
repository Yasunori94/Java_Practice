package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    //    ハンドラーメソッドとリクエストを紐付けるためのGetMapping、/と紐付け
    @GetMapping("/")
    //    レスポンスする内容の、メソッドを作成(ハンドラーメソッド)
    public String index(){
//        templatesファイル内の、index.htmlをreturnする
        return "index";
    }
}
