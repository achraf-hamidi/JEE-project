package dao.api;


import dao.entities.Course;

import java.util.List;
public interface CourseDao{

    public boolean insert(Course course);
    public List<Course> getAllCourse();
    public boolean delete(long courseId);
    public boolean update(Course course);
    public Course getCourseById(long id);

}