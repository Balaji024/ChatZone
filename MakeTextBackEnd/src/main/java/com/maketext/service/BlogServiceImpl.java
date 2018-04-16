package com.maketext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maketext.DAO.BlogDAO;
import com.maketext.model.Blog;
import com.maketext.model.BlogComment;

@Transactional
@Service
public class BlogServiceImpl implements BlogService {
	@Autowired
	private BlogDAO blogDAO;

	
	public boolean addBlog(Blog blog) {
		// TODO Auto-generated method stub
		
		return blogDAO.addBlog(blog);
	}

	public boolean updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDAO.updateBlog(blog);
	}

	public boolean deleteBlog(int blogId) {
		// TODO Auto-generated method stub
		return blogDAO.deleteBlog(blogId);
	}

	public List<Blog> listBlogs(String username) {
		// TODO Auto-generated method stub
		return blogDAO.listBlogs(username);	}

	public boolean approvedBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDAO.approvedBlog(blog);
	}

	public boolean rejectedBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDAO.rejectedBlog(blog);
	}

	public Blog getBlog(int blogId) {
		// TODO Auto-generated method stub
		return blogDAO.getBlog(blogId);
	}

	public List<Blog> listAllBlogs() {
		// TODO Auto-generated method stub
		return blogDAO.listAllBlogs();
	}

	public boolean incrementLike(Blog blog) {
		// TODO Auto-generated method stub
		return blogDAO.incrementLike(blog);
	}

	public boolean addBlogComment(BlogComment blogComment) {
		// TODO Auto-generated method stub
		return blogDAO.addBlogComment(blogComment);
	}

	public boolean deleteBlogComment(BlogComment blogComment) {
		// TODO Auto-generated method stub
		return blogDAO.deleteBlogComment(blogComment);
	}

	public BlogComment getBlogComment(int commentId) {
		// TODO Auto-generated method stub
		return blogDAO.getBlogComment(commentId);
	}

	public List<BlogComment> listBlogComments(int blogId) {
		// TODO Auto-generated method stub
		return blogDAO.listBlogComments(blogId);
	}

}
