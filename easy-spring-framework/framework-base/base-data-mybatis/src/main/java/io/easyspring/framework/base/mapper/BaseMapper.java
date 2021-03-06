package io.easyspring.framework.base.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;

/**
 * 公共的 Dao 接口
 *
 * @author summer
 * @version V1.0.0-RELEASE
 * DateTime 2018-12-02 22:22
 */
public interface BaseMapper<T>  extends
        Mapper<T>,
        MySqlMapper<T>,
        BaseSelectMapper<T>,
        BaseCurrentMapper {
}