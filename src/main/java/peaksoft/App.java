package peaksoft;

import peaksoft.dao.CourseDao;
import peaksoft.dao.impl.CourseDaoImpl;
import peaksoft.dao.impl.InstructorDaoImpl;
import peaksoft.dao.impl.TaskDaoImpl;
import peaksoft.entity.Course;
import peaksoft.entity.Instructor;
import peaksoft.entity.Lesson;
import peaksoft.entity.Task;
import peaksoft.service.impl.LessonServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {


       /* courseDao.saveCourse(new Course("JAVA 7", "java", LocalDate.of(2022, 12,
                1), "dhajsd", "java"));

        courseDao.saveCourse(new Course("JAVA 6", "java", LocalDate.of(2022, 12,
                1), "dhajsd", "java"));

        courseDao.saveCourse(new Course("JAVA 5", "java", LocalDate.of(2022, 12,
                1), "dhajsd", "java"));*/

        //System.out.println(courseDao.getCourseById(1L));
        /*for (Course i : courseDao.getAllCourse()) {
            System.out.println(i);*/


        /*courseDao.updateCourse(8L, new Course("Nurs", "c", LocalDate.of(1997, 3, 9),
                "nnn", "uuu"));*/
        /* courseDao.deleteCourseById(10L);*/

        /*System.out.println(courseDao.getCourseByName("Nurs"));*/

        /* InstructorDaoImpl instructorDao = new InstructorDaoImpl();*/

        /* instructorDao.saveInstructor(new Instructor("MUHAMMED", "ALLANOV",
                 "ALLANOV@mail.ru","+996 770 07 04 06"));*/

        /*System.out.println(instructorDao.getInstructorById(1L));*/

        /*instructorDao.updateInstructor(1L,"JANARBEK","SAMAN",);*/

        /*Course course = new Course("JAVA", "1",
                LocalDate.of(2022, 07, 1), "peaksoft", "BackEnd");
        Course course1 = new Course("JS", "1",
                LocalDate.of(2022, 07, 1), "peaksoft", "FrontEnd");*/



        /*Instructor instructor = new Instructor("Mukhamed",
                "Allanov","allanov21@gmail.com","+996 770 07 04 06");


        Instructor instructor1 = new Instructor("Nursultan",
                "Osorov","Osorov97@mail.ru","+996 990 09 03 97");*/


        /*Lesson lesson = new Lesson("Hibernate","fdwefw",1L);

        Lesson lesson1 = new Lesson("JDBC","dfsdfds",2L);


        Task task = new Task("Hibernate","monday","peaksoft.talentlms.com");

        Task task1 = new Task("JDBC","tuesday","peaksoft.talentlms.com");


        CourseDaoImpl courseDao = new CourseDaoImpl();
        InstructorDaoImpl instructorDaoimpl = new InstructorDaoImpl();
        LessonServiceImpl lessonService=new LessonServiceImpl();
        TaskDaoImpl taskDao= new TaskDaoImpl();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Select Number :");
            String SelectNumber = scanner.nextLine();

            System.out.println();

            switch (SelectNumber) {
                case "1" -> courseDao.saveCourse(course);
                case "2" -> courseDao.getCourseById(1L);
                case "3" -> courseDao.getAllCourse();
                case "4" -> courseDao.UpdateCourse(2L, course);
                case "5" -> courseDao.deleteCourseById(1L);
                case "6" -> courseDao.getCourseByName("Курс по IT");
                case "7" -> instructorDaoimpl.SaveInstructor(instructor);
                case "8" -> instructorDaoimpl.UpdateInstructor(1L, instructor);
                case "9" -> instructorDaoimpl.getInstructorById(1L);
                case "10" -> instructorDaoimpl.getInstructorByCourseId(1L);
                case "11" -> instructorDaoimpl.DeleteInstructorById(1L);
                case "12" -> instructorDaoimpl.assignInstructorToCourse(course.getId(), instructor.getId());
                case "13" -> lessonService.SaveLesson(lesson);
                case "14" -> lessonService.UpdateLesson(1L, lesson);
                case "15" -> lessonService.getLessonById(1L);
                case "16" -> lessonService.getLessonsByCourseId(1L);
                case "17" -> taskDao.saveTask(task);
                case "18" -> taskDao.getAllTaskByLessonId(1L);
                case "19" -> taskDao.deleteTaskById(2L);
                default -> System.out.println("OOOO");
            }


        }


    }
}
*/

    }
}

