package peaksoft.dao;

import peaksoft.entity.Course;

import java.util.List;

public interface CourseDao {
    void saveCourse(Course course);

    Course getCourseById(Long id);

    List<Course> getAllCourse();

    void UpdateCourse(Long id, Course course);

    void deleteCourseById(Long id);

    Course getCourseByName(String name);
}