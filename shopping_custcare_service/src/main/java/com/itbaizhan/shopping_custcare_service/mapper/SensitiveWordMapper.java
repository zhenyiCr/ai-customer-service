package com.itbaizhan.shopping_custcare_service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itbaizhan.shopping_common.pojo.SensitiveWord;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface SensitiveWordMapper extends BaseMapper<SensitiveWord> {
}
