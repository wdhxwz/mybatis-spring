package com.wangdh;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * @author wangdh
 * @Description
 * @date 2018-02-05
 */
public class BaseMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try(Reader reader = Resources.getResourceAsReader("mybatis-config.xml")){
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException ex){

        }
    }

    public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
