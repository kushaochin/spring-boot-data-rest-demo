package com.example.demo.dao;

import com.example.demo.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.mapping.CollectionResourceMapping;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="character",path = "character")
public interface CharacterDao extends JpaRepository<Character,Integer> {
//    List<Character> queryList();
//
//    @RestResource(exported = false) //不需要暴漏的接口，可以使用@RestResource(exported = false)隐藏该接口。
//    int delete(int id);
}
