package com.xxx.base.mybatis.mapper;

import tk.mybatis.mapper.common.SqlServerMapper;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;

/**
 * Sqlserver mapper基接口
 * 
 * @author wangdh
 *
 * @param <T>
 */
public interface SqlserverBaseMapper<T>
		extends SqlServerMapper<T>, BaseDeleteMapper<T>, BaseInsertMapper<T>, BaseSelectMapper<T>, BaseUpdateMapper<T> {

}
