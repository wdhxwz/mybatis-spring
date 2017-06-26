package com.wangdh.mybatis;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;

import com.wangdh.mybatis.config.MyBatisSqlSessionFactory;
import com.wangdh.mybatis.mapper.RoleEntityMapper;
import com.wangdh.mybatis.mapper.UserEntityMapper;
import com.wangdh.mybatis.mapper.UserRoleEntityMapper;
import com.wangdh.mybatis.mapper.entity.RoleEntity;
import com.wangdh.mybatis.mapper.entity.UserEntity;
import com.wangdh.mybatis.mapper.entity.UserRoleEntity;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		UserEntityMapper userMapper = sqlSession.getMapper(UserEntityMapper.class);
		RoleEntityMapper roleMapper = sqlSession.getMapper(RoleEntityMapper.class);
		UserRoleEntityMapper userRoleMapper = sqlSession.getMapper(UserRoleEntityMapper.class);

		MyBatisSqlSessionFactory.configMapper();

		String userId = UUID.randomUUID().toString();
		String roleId = UUID.randomUUID().toString();

		UserEntity userEntity = new UserEntity();
		userEntity.setEmail("1366678737@qq.com");
		userEntity.setId(userId);
		userEntity.setPhone("020-1234567");
		userEntity.setSex(1);
		userEntity.setUserName("wangdh");
		userEntity.setUserNo("cxx");
		userEntity.setRemark("add a user");

		RoleEntity role = new RoleEntity();
		role.setId(roleId);
		role.setRemark("add a role");
		role.setRoleName("admin");

		UserRoleEntity userRoleEntity = new UserRoleEntity();
		userRoleEntity.setRoleId(roleId);
		userRoleEntity.setUserId(userId);
		try {
			userMapper.insert(userEntity);
			roleMapper.insert(role);
			userRoleMapper.insert(userRoleEntity);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		}

		System.out.println("OK");
	}
}