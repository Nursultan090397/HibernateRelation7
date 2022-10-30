package peaksoft.service;

import peaksoft.entity.Course;

import java.util.List;

public interface CourseService {
    void saveCourse (Course course);

    void getCourseById (Long id);

    List<Course> getAllCourse  ();

    void updateCourse (Long id, Course course);

    void UpdateCourse(Long id, Course course);

    void deleteCourseById (Long id);

    void getCourseByName (String name);


}
