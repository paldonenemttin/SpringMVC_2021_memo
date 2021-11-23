package com.callor.memo.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemoVO {

    private Long No;
    private String date;
    private String time;
    private String user;
    private String memo;
    private String title;

}
