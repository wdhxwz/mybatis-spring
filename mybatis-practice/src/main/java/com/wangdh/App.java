package com.wangdh;


import com.wangdh.mybatis.practice.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static SqlSessionFactory sqlSessionFactory;
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        try(Reader reader = Resources.getResourceAsReader("mybatis-config.xml")){
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException ex){
            logger.error(ex.getMessage());
        }
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            List<Country> countryList = sqlSession.selectList("selectAll");
            countryList.forEach(country -> {
                System.out.println(country.toString());
            });
        }


        System.out.println( "Hello World!" );
    }
}
