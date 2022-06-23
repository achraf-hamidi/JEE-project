package dao.api;

import dao.entities.Posts;

import java.util.List;

public interface PostsDao {

    public boolean insert(Posts post);
    public List<Posts> getAllPosts();
    public boolean delete(long postNo);
    public boolean update(Posts post);
    public Posts getPostById(long id);

}
