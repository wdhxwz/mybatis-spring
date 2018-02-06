package com.wangdh.mybatis.config;

import com.wangdh.mybatis.mapper.RoleEntityMapper;
import com.wangdh.mybatis.mapper.UserEntityMapper;
import com.wangdh.mybatis.mapper.UserRoleEntityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.io.InputStream;

public class MyBatisSqlSessionFactory {

	/**
	 * 数据库连接工厂，全局唯一
	 */
	private static SqlSessionFactory sqlSessionFactory;
	static{
		if (sqlSessionFactory == null) {
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (Exception e) {
				throw new RuntimeException(e.getCause());
			}
		}
	}

	/**
	 * 获取数据库连接(非线程安全)
	 * @return SqlSession
	 */
	public static SqlSession openSession(){
		return sqlSessionFactory.openSession();
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