package com.maketext.DAO;

import java.util.List;

import com.maketext.model.Blog;
import com.maketext.model.BlogComment;
import com.maketext.model.Forum;
import com.maketext.model.ForumComment;

public interface ForumDAO {
	public boolean addForum(Forum forum);
	public boolean updateForum(Forum forum);
	public boolean deleteForum(int forumId);
	public List<Forum> listForums(String username);
	public boolean approvedForum(Forum forum);
	public boolean rejectedForum(Forum forum);
	public Forum getForum(int forumId);
	public List<Forum> listAllForums();
	public boolean incrementLike(Forum forum);
	
	public boolean addforumComment(ForumComment forumComment);
	public boolean deleteForumComment(ForumComment forumComment);
	public ForumComment getForumComment(int commentId);
	public List<ForumComment> listForumComments(int ForumId);

}
