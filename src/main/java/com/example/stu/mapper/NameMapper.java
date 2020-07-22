package com.example.stu.mapper;

import com.example.stu.bean.Name;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author eibiu
 */
@Mapper
public interface NameMapper {
    List<Name> getData();
}
