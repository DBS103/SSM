package com.dbs.mapper;

import java.util.List;

import com.dbs.entity.UserInfo;

public interface UserInfoMapper {
	
	public UserInfo selectByEntity(UserInfo user);
	
	public List<UserInfo> selectAll();
	
}
