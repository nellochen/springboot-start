package com.xiaofeng.mapper;

import com.xiaofeng.domain.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/30
 * @email chenxf84@gmail.com
 */

@Mapper
public interface CityMapper {

    City selectCityById(int city_id);
}
