package com.example.its.domain.isssue;

import java.util.List;

public class issueService {

    public List<issueEntity> findAll(){
//       issueEntityというクラスのインスタンスを含むリストを返すためのメソッド
        return List.of(
//                issueEntityコンストラクタからインスタンス生成
                new issueEntity(1, "概要1", "説明1"),
                new issueEntity(2, "概要2", "説明2"),
                new issueEntity(3, "概要3", "説明3")
        );
    }

}
