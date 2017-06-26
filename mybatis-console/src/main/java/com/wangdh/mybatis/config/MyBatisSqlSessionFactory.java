package com.wangdh.mybatis.config;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wangdh.mybatis.mapper.RoleEntityMapper;
import com.wangdh.mybatis.mapper.UserEntityMapper;
import com.wangdh.mybatis.mapper.UserRoleEntityMapper;

import tk.mybatis.mapper.mapperhelper.MapperHelper;

public class MyBatisSqlSessionFactory {

	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (Exception e) {
				throw new RuntimeException(e.getCause());
			}
		}

		return sqlSessionFactory;
	}

	/**
	 * 获取数据库连接
	 * @return SqlSession
	 */
	public static SqlSession openSession(){
		return getSqlSessionFactory().openSession();
	}
	
	/**
	 * 集成通用mapper
	 */
	public static void configMapper(){
		MapperHelper mapperHelper = new MapperHelper();
		mapperHelper.registerMapper(UserEntityMapper.class);
		mapperHelper.registerMapper(RoleEntityMapper.class);
		mapperHelper.registerMapper(UserRoleEntityMapper.class);
		mapperHelper.processConfiguration(openSession().getConfiguration());
	}
}