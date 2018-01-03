package com.yue.springboot.multi.datasource.demo.domain.secondary;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yue.springboot.multi.datasource.demo.domain.User;

public interface SecondaryUserPageRepository extends PagingAndSortingRepository<User, Long> {

}
