package com.fyc.park.bean;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbggenerated
	 */
	int deleteUserByKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbggenerated
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbggenerated
	 */
	User selectUserByKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbggenerated
	 */
	int updateByPrimaryKey(User record);
	
	User selecUserByNameAndPwd(@Param("name")String name, @Param("pwd")String pwd);

	List<User> selectUsers(@Param("start")int start, @Param("end")int end);

	int selectUserCount();
	
}