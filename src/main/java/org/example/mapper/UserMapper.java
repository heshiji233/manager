package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.User;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    public List<User> sellectFirst();
}
