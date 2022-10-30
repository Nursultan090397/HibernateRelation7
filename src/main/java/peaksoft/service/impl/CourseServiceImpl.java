package peaksoft.service.impl;

import peaksoft.dao.CourseDao;
import peaksoft.dao.impl.CourseDaoImpl;
import peaksoft.entity.Course;
import peaksoft.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    private CourseDao courseDao = new CourseDaoImpl();

    @Override
    public void saveCourse(Course course) {
        courseDao.saveCourse(course);
    }
    @Override
    public void getCourseById(Long id) {
        courseDao.getCourseById(id);
    }
    @Override
    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    @Override
    public void updateCourse(Long id, Course course) {

    }

    @Override
    public void UpdateCourse(Long id, Course course) {
        courseDao.UpdateCourse(id, course);
    }
    @Override
    public void deleteCourseById(Long id) {
        courseDao.deleteCourseById(id);
    }
    @Override
    public void getCourseByName(String name) {
        courseDao.getCourseByName(name);
    }
}