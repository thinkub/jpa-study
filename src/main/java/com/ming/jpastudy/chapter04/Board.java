package com.ming.jpastudy.chapter04;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2020. 9. 9..
 */

@Getter
@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
