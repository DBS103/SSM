package com.dbs.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbs.entity.UserInfo;
import com.dbs.service.UserInfoService;

@Controller
public class UserInfoAction {
	
	@Autowired
	private UserInfoService userService;
	
	@RequestMapping(value="login",method=RequestMethod.POST,produces = "text/html;charset=UTF-8")
	public String isLogin(UserInfo user,Model model) {
		UserInfo user1 = userService.selectByEntity(user);
		if(user1!=null) {
			List<UserInfo> userList = userService.selectAll();
			model.addAttribute("user",user1);
			model.addAttribute("userList",userList);
			return "userManager";
		}else {
		
			model.addAttribute("msg","用户名或密码错误");
			return "../../login";
		}
	}
	

}
