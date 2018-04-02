package com.maketext.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Forum {
	@Id
	int forumId;
	String forumName;
	String forumContent;
	Date createDate;
	int likes;
	String username;
	String status;
}
