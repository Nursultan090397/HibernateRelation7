package peaksoft.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.LessonDao;
import peaksoft.entity.Course;
import peaksoft.entity.Lesson;
import peaksoft.service.LessonService;
import peaksoft.util.Util;

import java.util.List;

public class LessonDaoImpl implements LessonDao {
    private final SessionFactory sessionFactory = Util.createsessionFactory();

    @Override
    public  void SaveLesson(Lesson lesson){
        Session session = Util.createsessionFactory().openSession();
        session.beginTransaction();
        session.persist(lesson);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void UpdateLesson(Long id, Lesson lesson){
        Session session = Util.createsessionFactory().openSession();
        session.beginTransaction();
        Lesson lesson1 = session.find(Lesson.class,id);
        lesson1.setLessonName(lesson.getLessonName());
        lesson1.setVideoLink(lesson.getVideoLink());
        lesson1.setId(lesson.getId());
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public  Lesson getLessonById(Long id){
        Session session =Util.createsessionFactory().openSession();
        session.beginTransaction();
        Lesson lesson = session.find(Lesson.class,id);
        session.getTransaction().commit();
        session.close();
        return lesson;
    }
    @Override
    public List<Lesson> getLessonsByCourseId(Long id){
        Session session = Util.createsessionFactory().openSession();
        session.beginTransaction();
        Course course = session.find(Course.class,id);
        session.getTransaction().commit();
        session.close();
        return null;
    }
}



