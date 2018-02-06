package com.wangdh.mybatis.practice.mapper;

import com.wangdh.mybatis.practice.model.SysRole;
import com.wangdh.mybatis.practice.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangdh
 * @Description
 * @date 2018-02-05
 */
public interface SysUserMapper {
    /**
     * 根据id查询用户
     * @param id 用户id
     * @return
     */
    SysUser selectById(Long id);

    /**
     * 获取所有用户
     * @return
     */
    List<SysUser> selectAll();

    /**
     * 获取用户的角色列表
     * @param userId 用户id
     * @return
     */
    List<SysRole> selectRolesByUserId(Long userId);

    /**
     * 新增一个用户
     * @param sysUser 用户实体
     * @return
     */
    int insert(SysUser sysUser);

    /**
     * 新增一个用户
     * @param sysUser 用户实体
     * @return
     */
    int insert2(SysUser sysUser);

    /**
     * 根据用户id更新用户信息
     * @param sysUser
     * @return
     */
    int updateById(SysUser sysUser);

    /**
     * 根据id删除用户
     * @param userId
     * @return
     */
    int deleteById(Long userId);

    List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);

    List<SysRole> selectRolesByUserIdAndRoleEnabled2(@Param("user") SysUser sysUser, @Param("role") SysRole sysRole);
}
