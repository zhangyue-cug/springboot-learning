package com.yue.springboot.jpa.demo.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * @Description: 用户Repository接口
 * 
 * @author zhangyue
 * @since 2018-01-02 16:38:22
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
