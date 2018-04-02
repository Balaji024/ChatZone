package com.maketext.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetail {
	@Id
String loginname;
String password;
String username;
String emailId;
String mobileNumber;
String address;
}
