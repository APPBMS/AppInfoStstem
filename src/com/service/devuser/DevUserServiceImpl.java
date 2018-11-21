package com.service.devuser;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dao.devuser.DevUserMapper;
import com.entity.DevUser;

@Service
public class DevUserServiceImpl implements DevUserService {
	@Resource
	private DevUserMapper mapper;
	@Override
	public DevUser login(String devCode, String devPassword){
		// TODO Auto-generated method stub
		DevUser user = mapper.getLoginUser(devCode,devPassword);
		return user;
	}

}
