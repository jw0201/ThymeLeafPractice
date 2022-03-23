package com.jiwon.thymeleafpractice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FilterRepositoryTest {

    @Autowired
    FilterRepository filterRepository;

    @Test
    public void filterRepositoryTest() {

        filterRepository.findAll().stream().forEach(System.out::println);
    }

}
