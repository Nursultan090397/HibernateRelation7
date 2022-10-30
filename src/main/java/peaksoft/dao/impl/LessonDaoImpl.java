package peaksoft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.entity.Course;
import peaksoft.entity.Lesson;
import peaksoft.service.LessonService;
import peaksoft.util.Util;

import java.util.List;

public class LessonDaoImpl implements LessonService {
    private final SessionFactory sessionFactory = Util.createsessionFactory();

    @Override
    public void saveLesson(Lesson lesson) {
        try
                (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(lesson);
            session.getTransaction().commit();
        }

    }

    @Override
    public void updateLesson(Long id, Lesson lesson) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Lesson lesson1 = session.get(Lesson.class, id);

            lesson1.setLessonName(lesson.getLessonName());
            lesson1.setVideoLink(lesson.getVideoLink());

            session.saveOrUpdate(lesson1);
            session.getTransaction().commit();


        }
    }

    @Override
    public Lesson getLessonById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Lesson lesson = session.get(Lesson.class, id);
            session.getTransaction().commit();
            return lesson;
        }

    }

    @Override
    public List<Lesson> getLessonsByCourseId(Long id) {
        try (Session session = Util.createsessionFactory().openSession()) {
            session.beginTransaction();
            Course course = session.find(Course.class, id);
            session.getTransaction().commit();
            return null;

        }
    }
}



