package com.wangdh;

import com.wangdh.mybatis.practice.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author wangdh
 * @Description
 * @date 2018-02-05
 */
public class CountryMapperTest extends BaseMapperTest{
    @Test
    public void testSelectAll(){
        try(SqlSession sqlSession = getSqlSession()){
            List<Country> countryList = sqlSession.selectList("com.wangdh.mybatis.practice.mapper.CountryMapper.selectAll");
            countryList.forEach(country -> {
                System.out.println(country.toString());
            });
        }
    }
}
