package dao.api;

import dao.entities.Notifications;

import java.util.List;

public interface NotificationsDao {

    public boolean insert(Notifications note);
    public List<Notifications> getAllNotifications();
    public boolean delete(long noteId);
    public boolean update(Notifications note);
    public Notifications getNotifationById(long id);

}