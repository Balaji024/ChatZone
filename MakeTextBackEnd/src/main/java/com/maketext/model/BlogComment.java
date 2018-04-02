package com.maketext.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BlogComment {
	@Id
	int commentId;
	String commentText;
	String loginName;
	int blogId;
	Date commentDate;
	

}
