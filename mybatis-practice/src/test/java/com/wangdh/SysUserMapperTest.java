package com.wangdh;

import com.wangdh.mybatis.practice.mapper.SysUserMapper;
import com.wangdh.mybatis.practice.model.SysRole;
import com.wangdh.mybatis.practice.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Random;


/**
 * @author wangdh
 * @Description
 * @date 2018-02-05
 */
public class SysUserMapperTest extends BaseMapperTest{
    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserMapperTest.class);

    @Test
    public void testSelectById(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser sysUser = sysUserMapper.selectById(1L);
            Assert.assertNotNull(sysUser);
            Assert.assertEquals("admin",sysUser.getUserName());

            LOGGER.info("aaa");
        }
    }

    @Test
    public void testSelectAll(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysUser> userList = sysUserMapper.selectAll();

            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size() > 0);
            userList.forEach(sysUser -> {
                System.out.println(sysUser.toString());
            });
        }
    }

    @Test
    public  void testSelectRolesByUserId(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysRole> roleList = sysUserMapper.selectRolesByUserId(1L);
            Assert.assertNotNull(roleList);
            Assert.assertTrue(roleList.size() > 0);
            roleList.forEach(sysRole -> {
                System.out.println(sysRole.toString());
            });
        }
    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            List<SysRole> roleList = sysUserMapper.selectRolesByUserIdAndRoleEnabled(1L,1);
            Assert.assertNotNull(roleList);
            Assert.assertTrue(roleList.size() > 0);
            roleList.forEach(sysRole -> {
                System.out.println(sysRole.toString());
            });
        }
    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled2(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            SysRole role = new SysRole();
            role.setEnabled(1);
            SysUser sysUser =new SysUser();
            sysUser.setId(1L);
            List<SysRole> roleList = sysUserMapper.selectRolesByUserIdAndRoleEnabled2(sysUser,role);
            Assert.assertNotNull(roleList);
            Assert.assertTrue(roleList.size() > 0);
            roleList.forEach(sysRole -> {
                System.out.println(sysRole.toString());
            });
        }
    }

    @Test
    public void testInsert(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);

            SysUser sysUser = getUser();

            int result = sysUserMapper.insert(sysUser);

            // 没有配置自动提交，默认是不提交的
            // sqlSession.commit();

            Assert.assertEquals(1,result);
            Assert.assertNotNull(sysUser.getId());
        }
    }

    private SysUser getUser(){
        SysUser sysUser = new SysUser();
        String userName = "test" + new Random(1000).nextInt();
        sysUser.setUserName(userName);
        sysUser.setUserPassword("123456");
        sysUser.setCreateTime(new Date());
        sysUser.setHeadImg("http://www.baidu.com");
        sysUser.setUserInfo(userName + " user");
        sysUser.setUserEmail(userName + "@wangdh.com");

        return sysUser;
    }

    @Test
    public void testInsert2(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);

            SysUser sysUser = getUser();

            int result = sysUserMapper.insert2(sysUser);

            // 没有配置自动提交，默认是不提交的
            // sqlSession.commit();

            Assert.assertEquals(1,result);
            Assert.assertNotNull(sysUser.getId());
        }
    }

    @Test
    public void testUpdateById(){
        try(SqlSession sqlSession = getSqlSession()){
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser sysUser = sysUserMapper.selectById(1005L);
            SysUser newUser = getUser();
            newUser.setId(sysUser.getId());

            int result = sysUserMapper.updateById(newUser);

            Assert.assertEquals(1,result);

            sqlSession.commit();
        }
    }

    @Test
    public void testDeleteById(){
        try(SqlSession sqlSession = getSqlSession()) {
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            int result = sysUserMapper.deleteById(1005L);
            Assert.assertEquals(1,result);

            // sqlSession.commit();
        }
    }

}
