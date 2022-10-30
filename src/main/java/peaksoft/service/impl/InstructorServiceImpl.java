package peaksoft.service.impl;

import peaksoft.dao.InstructorDao;
import peaksoft.dao.impl.InstructorDaoImpl;
import peaksoft.entity.Course;
import peaksoft.entity.Instructor;
import peaksoft.service.InstructorService;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {
    InstructorDao instructorDao = new InstructorDaoImpl();

    @Override
    public void SaveInstructor(Instructor instructor) {
        instructorDao.SaveInstructor(instructor);
    }

    @Override
    public void UpdateInstructor(Long id, Instructor instructor) {
        instructorDao.UpdateInstructor(id,instructor);


    }

    @Override
    public void getInstructorById(Long id) {
        instructorDao.getInstructorById(id);

    }

    @Override
    public List<Instructor> getInstructorByCourseId(Course id) {

        return instructorDao.getInstructorByCourseId(id.getId());
    }

    @Override
    public void DeleteInstructorById(Long id) {
        instructorDao.DeleteInstructorById(id);

    }

    @Override
    public void assignInstructorToCourse(Long course_id, Long instructor_id) {
        instructorDao.assignInstructorToCourse(course_id,instructor_id);

    }
}