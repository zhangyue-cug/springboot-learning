package com.yue.springboot.jpa.demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPageRepository extends PagingAndSortingRepository<User, Long> {

}
