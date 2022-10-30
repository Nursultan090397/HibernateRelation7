package peaksoft.service;

import peaksoft.entity.Course;
import peaksoft.entity.Instructor;

import java.util.List;

public interface InstructorService {
    void SaveInstructor(Instructor instructor);


    void UpdateInstructor(Long id, Instructor instructor);



    void getInstructorById(Long id);

    List<Instructor> getInstructorByCourseId(Course id);

    void DeleteInstructorById(Long id);

    void assignInstructorToCourse(Long course_id, Long instructor_id);
}