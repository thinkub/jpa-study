package com.ming.jpastudy.chapter05;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2020. 9. 14..
 */

@Entity
@Getter
public class Team {

    @Id
    @Column(name = "team_id")
    private String id;

    private String name;
}
