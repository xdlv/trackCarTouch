package com.fyc.park.bean;

public class Userrole {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_userrole.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_userrole.userId
	 * @mbggenerated
	 */
	private Integer userid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_userrole.roleId
	 * @mbggenerated
	 */
	private Integer roleid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_userrole.id
	 * @return  the value of t_userrole.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_userrole.id
	 * @param id  the value for t_userrole.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_userrole.userId
	 * @return  the value of t_userrole.userId
	 * @mbggenerated
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_userrole.userId
	 * @param userid  the value for t_userrole.userId
	 * @mbggenerated
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_userrole.roleId
	 * @return  the value of t_userrole.roleId
	 * @mbggenerated
	 */
	public Integer getRoleid() {
		return roleid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_userrole.roleId
	 * @param roleid  the value for t_userrole.roleId
	 * @mbggenerated
	 */
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
}