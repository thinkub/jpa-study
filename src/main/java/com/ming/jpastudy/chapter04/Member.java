package com.ming.jpastudy.chapter04;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author by Ming(thinkub0219@gmail.com) on 2020. 9. 9..
 */

@Getter
@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String userName;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastModifiedDate;

    @Lob
    private String description;
}
