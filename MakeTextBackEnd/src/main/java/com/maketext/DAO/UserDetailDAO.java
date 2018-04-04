package com.maketext.DAO;

import com.maketext.model.UserDetail;

public interface UserDetailDAO {
	public boolean registerUser(UserDetail userDetail);
	public boolean checkCredential(UserDetail userDetail);
	public UserDetail getUser(String loginName);
    public boolean updateUser(UserDetail userdetail);
}
