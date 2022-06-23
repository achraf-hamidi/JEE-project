package dao.api;

import dao.entities.Feedbacks;

import java.util.List;

public interface FeedbacksDao{

    public boolean insert(Feedbacks feed);
    public List<Feedbacks> getAllFeedbacks();
    public boolean delete(long feedId);
}