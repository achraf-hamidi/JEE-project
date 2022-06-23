package dao.api;

import dao.entities.Admin;

public interface AdminDao {

    public boolean insert(Admin admin);
    public Admin getAdminById(String adminId);

}