package com.maketext.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.maketext.DAO.BlogDAO;
import com.maketext.model.Blog;

public class BlogTest {
static BlogDAO blogDAO;

@BeforeClass
public static void intialize(){
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.maketext.*");
	context.refresh();
	
	blogDAO=(BlogDAO)context.getBean("blogDAO");
}

@Test
public void addBlogTest(){
	Blog blog=new Blog();
	blog.setBlogName("Work");
	blog.setBlogContent("If u want to stay healthy please work");
	blog.setLikes(0);
	blog.setLoginname("Balaji");
	blog.setCreateDate(new java.util.Date());
	blog.setStatus("status");
	blog.setBlogId(1);
	assertTrue("Problem in Blog Insetion",blogDAO.addBlog(blog));
	
}
@Ignore
@Test
public void deleteBlogTest(){
	
	assertTrue("Problem in Blog Deletion",blogDAO.deleteBlog(953));
	
}
@Ignore
@Test
public void rejectBlogTest(){
	Blog blog=blogDAO.getBlog(953);
	assertTrue("Problem in Blog Rejection",blogDAO.rejectedBlog(blog));
	
}

/*@Test
public void approvalBlogTest(){
	Blog blog=blogDAO.getBlog(953);
	assertTrue("Problem in Blog Approval",blogDAO.approveBlog(blog));
	
}

@Test
public void listBlogbyUserTest(){
	List<Blog> listblog=blogDAO.listBlogs("ray");
	assertTrue("Problem in listing blog",listblog.size()>0);
	
	for(Blog blog:listblog)
	{
		System.out.println(blog.getBlogName()+"::::");
		System.out.println(blog.getBlogContent()+":::");
		System.out.println(blog.getLoginName());
	}
	
}*/

/*@Test
public void incrementBlogLikeTest(){
	Blog blog=blogDAO.getBlog(953);
	assertTrue("Problem in Increment Like",blogDAO.incrementLike(blog));
	
}
@Test
public void addCommentTest(){
	BlogComment comment=new BlogComment();
	comment.setLoginName("ray");
	comment.setCommentText("this is the comment line");
	comment.setBlogId(953);
	comment.setCommentDate(new java.util.Date());
	assertTrue("Problem in Blog Approval",blogDAO.addBlogComment(comment));
}*/
}
