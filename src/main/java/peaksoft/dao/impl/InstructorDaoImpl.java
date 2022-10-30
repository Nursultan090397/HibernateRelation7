package peaksoft.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import peaksoft.dao.InstructorDao;
import peaksoft.entity.Course;
import peaksoft.entity.Instructor;
import peaksoft.util.Util;

import java.util.ArrayList;
import java.util.List;

public class InstructorDaoImpl implements InstructorDao {
    @Override
    public void SaveInstructor(Instructor instructor) {
        try(Session session = Util.createsessionFactory().openSession()) {
            ;
            session.beginTransaction();
            session.persist(instructor);
            session.getTransaction().commit();
            System.out.println("successfully");
        }
    }

    @Override
    public void UpdateInstructor(Long id, Instructor instructor) {
        try(Session session = Util.createsessionFactory().openSession()){
            session.beginTransaction();
            Instructor newIns = session.get(Instructor.class, id);
            newIns.setFirstName(instructor.getFirstName());
            newIns.setLastName(instructor.getLastName());
            newIns.setEmail(instructor.getEmail());
            newIns.setPhoneNumber(instructor.getPhoneNumber());
            session.saveOrUpdate(newIns);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Instructor getInstructorById(Long id) {
        try(Session session = Util.createsessionFactory().openSession()){
            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, id);
            session.getTransaction().commit();
            return instructor;
        } catch (HibernateException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Instructor> getInstructorByCourseId(Long id) {
        try(Session session = Util.createsessionFactory().openSession()){
            session.beginTransaction();
            List<Course> courses = session.createQuery("select c from Course c where c.id = :id", Course.class)
                    .setParameter("id", id).list();

            Course course = courses.get(0);
            List<Instructor> instructors = new ArrayList<>(course.getInstructors());
            session.getTransaction().commit();
            return instructors;
        } catch (HibernateException e) {
            throw new RuntimeException();
        }
    }
    @Override
    public void DeleteInstructorById(Long id) {
        try(Session session = Util.createsessionFactory().openSession()){
            session.beginTransaction();
            Instructor instructor = session.find(Instructor.class, id);
            session.remove(instructor);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void assignInstructorToCourse(Long course_id, Long instructor_id) {
        try(Session session = Util.createsessionFactory().openSession()){
            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, instructor_id);
            Course course = session.get(Course.class, course_id);
            instructor.getCourses().add(course);
            course.getInstructors().add(instructor);
            session.saveOrUpdate(instructor);
            session.saveOrUpdate(course);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException();
        }
    }
}

