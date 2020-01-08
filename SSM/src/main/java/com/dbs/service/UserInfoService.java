package com.dbs.service;

import java.util.List;

import com.dbs.entity.UserInfo;

public interface UserInfoService {
	
	//�������ݲ�ѯ��¼��Ϣ
	public UserInfo selectByEntity(UserInfo user);
	
	//��ѯ�б�
	public List<UserInfo> selectAll();
	
	//���
	public boolean addUserInfo(UserInfo user);
	
	//������ҳ��Ǯ������id����Ҫ���µ���Ϣ
	public UserInfo selectById(int userId);
	
	//�޸�
	public boolean updateUserInfo(UserInfo user);
	
	//ɾ��
	public boolean deleteUserInfoById(int id);
	
	
	

}
