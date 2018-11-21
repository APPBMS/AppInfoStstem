package com.service.backenduser;
import com.entity.BackendUser;

public interface BackendUserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public BackendUser login(String userCode,String userPassword);
}
