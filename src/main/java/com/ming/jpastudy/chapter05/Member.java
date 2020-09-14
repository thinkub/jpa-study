package com.ming.jpastudy.chapter05;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2020. 9. 14..
 */

@Entity
@Getter
public class Member {
    @Id
    @Column(name = "member_id")
    private String id;
    private String userName;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;
}
