package com.xxx.base.mybatis.mapper;

import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;

/**
 * Mysql mapper基接口
 * 
 * @author wangdh
 *
 * @param <T>
 */
public interface MysqlBaseMapper<T>
		extends MySqlMapper<T>, BaseDeleteMapper<T>, BaseInsertMapper<T>, BaseSelectMapper<T>, BaseUpdateMapper<T> {

}
