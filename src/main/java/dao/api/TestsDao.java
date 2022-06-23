package dao.api;

import dao.entities.Tests;

import java.util.List;

public interface TestsDao {

    public boolean insert(Tests test);
    public List<Tests> getAllTests();
    public boolean delete(long testNo);
    public boolean update(Tests test);
    public Tests getTestById(long id);
    public Tests getTestById(String id);
    public List<Tests> getAllTestsBytest(String test);

}
