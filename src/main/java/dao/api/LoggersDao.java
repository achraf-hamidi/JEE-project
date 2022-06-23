package dao.api;

import dao.entities.Loggers;

public interface LoggersDao {

    public boolean insert(Loggers log);
    public boolean delete(long logId);
}