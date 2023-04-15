package com.example.its.web.issue;

import com.example.its.domain.isssue.issueEntity;
import com.example.its.domain.isssue.issueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class issueController {

    private final issueService issueService = new issueService();
//    issueServiceクラスから、インスタンスを作成（コンストラクタは、デフォルトコンストラクタ）
//    リストが格納されているfindAll()メソッドを呼び出すために作成


//    /issuesというパスに対応するメソッドを記述
//    ハンドラーメソッドと、/issuesというパスで渡されるリクエストを紐づけるためのGetMapping
    @GetMapping("/issues")
    public String showList(Model model){
//        Java上のデータをテンプレートエンジン（Tymeleaf）に渡す際、Springに搭載されるModelというクラスの中のaddAtributeメソッドを使う
//        そのため、Modelをパラメーターに指定しModelのインスタンスを受け渡し、後述で、Modelというクラス内の、特定のメソッドを使う

//        ModelのaddAttributeを呼び出し
        model.addAttribute("issueList", issueService.findAll());
//        Tymeleafに渡すときのキーをissueListにし、渡すオブジェクト自体をissueServiceのインスタンスで呼び出したfindAll()のリストにする
        return "issues/List";
//        ビューを返す動作。resource内の、templatesフォルダ内の、issues/List.htmlをさす
    }
}
