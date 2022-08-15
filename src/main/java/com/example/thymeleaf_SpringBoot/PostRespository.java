package com.example.thymeleaf_SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRespository extends JpaRepository<Post, Integer> {

}
