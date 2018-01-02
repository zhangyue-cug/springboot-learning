package com.yue.springboot.jpa.demo.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yue.springboot.jpa.demo.domain.User;
import com.yue.springboot.jpa.demo.domain.UserPageRepository;
import com.yue.springboot.jpa.demo.domain.UserRepository;
import com.yue.springboot.jpa.demo.service.UserService;

/**
 * @Description: 操作user表Service实现
 * 
 * @author zhangyue
 * @since 2018-01-02 10:56:24
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserPageRepository userPageRepository;
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<User> listUser() {
		List<User> list = (List<User>) userRepository.findAll();
		return list;
	}

	@Override
	public List<User> queryUser(String name) {
		String hql = "from User u where u.name = ?1";
		TypedQuery<User> q = entityManager.createQuery(hql, User.class);
		q.setParameter(1, name);
		return q.getResultList();
	}

	@Override
	public Page<User> listUserPage(int page) {
		Page<User> u = userPageRepository.findAll(new PageRequest(page, 1, new Sort(new Order(Direction.DESC, "id"))));
		return u;
	}

}
