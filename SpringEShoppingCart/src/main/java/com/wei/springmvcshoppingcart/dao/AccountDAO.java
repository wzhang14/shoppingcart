package com.wei.springmvcshoppingcart.dao;

import com.wei.springmvcshoppingcart.entity.Account;

public interface AccountDAO {
	
	public Account findAccount(String userName);

}
