package peaksoft.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.dao.TaskDao;
import peaksoft.entity.Task;
import peaksoft.util.Util;

public class TaskDaoImpl implements TaskDao {
    private final SessionFactory sessionFactory = Util.createsessionFactory();

    @Override
    public void saveTask(Task task) {

        try
                (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(task);
            session.getTransaction().commit();
        }

    }

    @Override
    public void updateLesson(Long id, Task task) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
           Task task1 = session.get(Task.class, id);

            task1.setName(task.getName());
            task1.setDeadline(task.getDeadline());
            task1.setTask(task.getTask());


            session.saveOrUpdate(task1);
            session.getTransaction().commit();


        }

    }

    @Override
    public Task getAllTaskByLessonId(Long id) {
        Session session = Util.createsessionFactory().openSession();
        session.beginTransaction();
        Task task = session.find(Task.class,id);
        session.getTransaction().commit();
        session.close();
        return task;
    }

    @Override
    public void deleteTaskById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Task task2 = session.get(Task.class, id);
            session.remove(task2);
            session.getTransaction().commit();
        }

    }
}
