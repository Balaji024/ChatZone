package com.maketext.DAO;

import java.util.List;

import com.maketext.model.Blog;
import com.maketext.model.BlogComment;
import com.maketext.model.Forum;
import com.maketext.model.ForumComment;

public interface ForumDAO {
	public boolean addForum(Forum forum);
	public boolean updateBlog(int forumId);
	public boolean deleteBlog(Forum forum);
	
	public List<Forum> listForums(String username);
	public boolean approvedForum(Forum forum);
	public boolean rejectedForum(Forum forum);
	public Blog getBlog(int forumId);
	public List<Blog> listAllBlogs();
	public boolean incrementLike(Forum forum);
	
	public boolean addBlogComment(ForumComment forumComment);
	public boolean deleteBlogComment(ForumComment forumComment);
	public BlogComment getBlogComment(int commentId);
	public List<BlogComment> listBlogComments(int ForumId);

}
