package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="character_info")
public class Character {
    @Id
    private Integer id;

    @Column(name="character_name")
    private String characterName;

    private String description;

    @JsonIgnore //不想暴漏的字段，使用@JsonIgnore
    private Integer flag;
}
