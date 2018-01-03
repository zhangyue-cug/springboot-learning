package com.yue.springboot.multi.datasource.demo.domain.primary;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yue.springboot.multi.datasource.demo.domain.User;

public interface PrimaryUserPageRepository extends PagingAndSortingRepository<User, Long> {

}
