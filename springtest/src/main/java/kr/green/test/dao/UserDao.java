package kr.green.test.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.test.vo.UserVo;

public interface UserDao {
	
	public UserVo getUser(@Param("id")String id);

}
