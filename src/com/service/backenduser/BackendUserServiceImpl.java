package com.service.backenduser;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dao.backenduser.BackendUserMapper;
import com.entity.BackendUser;

@Service
public class BackendUserServiceImpl implements BackendUserService {
	@Resource
	private BackendUserMapper mapper;
	
	@Override
	public BackendUser login(String userCode, String userPassword){
		BackendUser user = mapper.getLoginUser(userCode,userPassword);
		return user;
	}

}
