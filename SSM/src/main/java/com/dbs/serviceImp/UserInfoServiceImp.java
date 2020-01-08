package com.dbs.serviceImp;

import java.util.List;

import com.dbs.entity.UserInfo;
import com.dbs.mapper.UserInfoMapper;
import com.dbs.service.UserInfoService;

public class UserInfoServiceImp implements UserInfoService {
	
	private UserInfoMapper umapper;
	
	public UserInfoMapper getUmapper() {
		return umapper;
	}

	public void setUmapper(UserInfoMapper umapper) {
		this.umapper = umapper;
	}

	@Override
	public UserInfo selectByEntity(UserInfo user) {
		System.out.println("User:"+user);
		UserInfo user1 = umapper.selectByEntity(user);
		return user1;
	}

	@Override
	public List<UserInfo> selectAll() {
		List<UserInfo> userList = umapper.selectAll();
		return userList;
	}

	@Override
	public boolean addUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfo selectById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUserInfoById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
