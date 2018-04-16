package com.maketext.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maketext.DAO.BlogDAO;
import com.maketext.DAO.ForumDAO;
import com.maketext.model.Blog;
import com.maketext.model.BlogComment;
import com.maketext.model.Forum;

public class ForumTest {

	static ForumDAO forumDAO;

	@BeforeClass
	public static void intialize(){
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.maketext.*");
		context.refresh();
		
		forumDAO=(ForumDAO)context.getBean("forumDAO");
	}
	@Ignore
	@Test
	public void addForumTest(){
		Forum forum=new Forum();
		forum.setForumId(1);
		forum.setForumName("ipl");
		forum.setLikes(0);
		forum.setForumContent("eight Nations Playing for a pride");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("status");
		forum.setUsername("Vivo");
		assertTrue("Problem in Blog Insertion",forumDAO.addForum(forum));
		
	}
	@Ignore
	@Test
	public void deleteForumTest(){
		
		assertTrue("Problem in forum Deletion",forumDAO.deleteForum(1));
		
	}
	@Ignore
	@Test
	public void rejectForumTest(){
		Forum forum=forumDAO.getForum(1);
		assertTrue("Problem in forum Rejection",forumDAO.rejectedForum(forum));
		
	}
	@Ignore
	@Test
	public void approvalForumTest(){
		Forum forum=forumDAO.getForum(2);
		assertTrue("Problem in Forum Approval",forumDAO.approvedForum(forum));
		
	}
	@Ignore
	@Test
	public void listForumbyUserTest(){
		List<Forum> listForum=forumDAO.listForums("Balaji");
		assertTrue("Problem in listing Forum",listForum.size()>0);
		
		for(Forum Forum:listForum)
		{
			System.out.println(Forum.getForumName()+"::::");
			System.out.println(Forum.getForumContent()+":::");
			System.out.println(Forum.getUsername());
		}
		
	}
	@Ignore
	@Test
	public void incrementForumLikeTest(){
		Forum forum=forumDAO.getForum(2);
		assertTrue("Problem in Increment Like",forumDAO.incrementLike(forum));
		
	}

	/*@Test
	public void addCommentTest(){
	omment=new BlogComment();
		
		comment.setLoginName("ray");
		comment.setCommentText("this is the comment line");
		comment.setBlogId(2);
		comment.setCommentDate(new java.util.Date());
		assertTrue("Problem in Blog Approval",forumDAO.addforumComment(comment));
	}
*/
}
