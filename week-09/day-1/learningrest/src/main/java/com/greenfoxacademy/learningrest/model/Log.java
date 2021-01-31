package com.greenfoxacademy.learningrest.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date = new Date();
    private Timestamp createdAt = new Timestamp(date.getTime());
    private String endpoint;
    private String data;

    public Log(String endpoint, String data) {
        this.endpoint = endpoint;
        this.data = data;
    }

}
