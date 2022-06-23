package dao.api;

import dao.entities.Reply;

import java.util.List;

public interface ReplyDao {

    public boolean insert(Reply reply);
    public List<Reply> getAllReply();
    public boolean delete(long replyId);
    public boolean update(Reply reply);
    public Reply getReplyById(long id);
    public List<Reply> getAllReplyByPost(Long postId);

}