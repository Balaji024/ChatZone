package com.maketext.DAO;

import java.util.List;

import com.maketext.model.Blog;
import com.maketext.model.BlogComment;
import com.maketext.model.Forum;
import com.maketext.model.ForumComment;

public class ForumDAOImpl implements ForumDAO {

	public boolean addForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateBlog(int forumId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBlog(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Forum> listForums(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean approvedForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean rejectedForum(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public Blog getBlog(int forumId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> listAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean incrementLike(Forum forum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addBlogComment(ForumComment forumComment) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteBlogComment(ForumComment forumComment) {
		// TODO Auto-generated method stub
		return false;
	}

	public BlogComment getBlogComment(int commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BlogComment> listBlogComments(int ForumId) {
		// TODO Auto-generated method stub
		return null;
	}

}
