package com.yue.springboot.multi.datasource.demo.domain.secondary;

import org.springframework.data.repository.CrudRepository;

import com.yue.springboot.multi.datasource.demo.domain.User;

/**
 * @Description: 用户Repository接口
 * 
 * @author zhangyue
 * @since 2018-01-02 16:38:22
 */
public interface SecondaryUserRepository extends CrudRepository<User, Long> {

}
