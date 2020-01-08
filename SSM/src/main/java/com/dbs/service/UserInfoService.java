package com.dbs.service;

import java.util.List;

import com.dbs.entity.UserInfo;

public interface UserInfoService {
	
	//根据数据查询登录信息
	public UserInfo selectByEntity(UserInfo user);
	
	//查询列表
	public List<UserInfo> selectAll();
	
	//添加
	public boolean addUserInfo(UserInfo user);
	
	//到更新页面钱，根据id查找要更新的信息
	public UserInfo selectById(int userId);
	
	//修改
	public boolean updateUserInfo(UserInfo user);
	
	//删除
	public boolean deleteUserInfoById(int id);
	
	
	

}
