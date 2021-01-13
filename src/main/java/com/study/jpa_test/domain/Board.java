package com.study.jpa_test.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "board")
public class Board {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer bdSeq;
    private String title;
    private String content;
}
