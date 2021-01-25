package com.greenfoxacademy.reddit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String postTitle;
    private String link;
    private Long vote = 0L;
    private Date date = new Date();
    private Timestamp timeStamp = new Timestamp(date.getTime());

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user = new User();

    public Reddit(String postTitle, String link, Long user_id) {
        this.postTitle = postTitle;
        this.link = link;
        this.user.setId(user_id);
    }
}
