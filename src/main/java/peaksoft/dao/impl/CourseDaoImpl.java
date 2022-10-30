package peaksoft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.entity.Course;
import peaksoft.service.CourseService;
import peaksoft.util.Util;

import java.util.List;

public class CourseDaoImpl implements CourseService {
    private final SessionFactory sessionFactory = Util.createsessionFactory();

    @Override
    public void saveCourse(Course course) {
        try
                (Session session = sessionFactory.openSession()){
                session.beginTransaction();
                session.save (course);
                session.getTransaction().commit();
            }

    }


    @Override
    public Course getCourseById(Long id) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            Course course = session.get(Course.class, id);
            session.getTransaction().commit();
            return course;
        }

    }

    @Override
    public List<Course> getAllCourse() {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            List < Course> courses = session.createQuery("select u from Course u").getResultList();
            session.getTransaction().commit();
            return courses;
        }

    }

    @Override
    public void updateCourse(Long id, Course course) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Course course1 = session.get(Course.class, id);

            course1.setCourseName(course.getCourseName());
            course1.setImageLink(course.getImageLink());
            course1.setDescription(course.getDescription());
            course1.setDuration(course.getDuration());
            course1.setCreateAt(course.getCreateAt());

            session.saveOrUpdate(course1);
            session.getTransaction().commit();


        }
    }

    @Override
    public void deleteCourseById(Long id) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            Course course2 = session.get(Course.class,id);
            session.remove(course2);
            session.getTransaction().commit();
        }

    }

    @Override
    public Course getCourseByName(String name) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            List <Course> course3 = session.createQuery("select u  from Course u").getResultList();
            for (Course course : course3){
                if (course.getCourseName().equals(name)){
                    return course;
                }
            }
            session.getTransaction().commit();
        }
        return null;
    }
}
