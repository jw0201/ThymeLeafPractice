package com.jiwon.thymeleafpractice.repository;

import com.jiwon.thymeleafpractice.domain.Filter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilterRepository extends JpaRepository<Filter, Long> {
}
