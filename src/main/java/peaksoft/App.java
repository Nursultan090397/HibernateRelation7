package peaksoft;


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


        Course course1 = new Course("Peaksoft", "Grajdanskaya 119", LocalDate.of(2022, 07, 1),
                "IMAGE", "NUMBER ONE");

        Course course2 = new Course("Makers>", "Samanchina 2", LocalDate.of(2019, 05, 1),
                "IMAGE1", "NUMBER ONE2");

        Course course3 = new Course("CODERS", "Tash-Rabat 59", LocalDate.of(2018, 07, 1),
                "IMAGE", "NUMBER ONE3");

        Instructor instructor1 = new Instructor("Mukhammed", "Allanov", "Allanov@gmail.com", "+996 990 09 09 09");
        Instructor instructor2 = new Instructor("Murkhammed", "Batyrov", "Batyrov@gmail.com", "+996 556 06 06 06");
        Instructor instructor3 = new Instructor("Janarbek", "Abdylashym", "Janarbek2000@gmail.com", "+996 09 03 97");


        Lesson lesson1 = new Lesson("Hibernate", "www.habr.com", 1l);
        Lesson lesson2 = new Lesson("JDBC", "www.JDBC.com", 2l);


        Task task1 = new Task("Project 'TimeTable'", "02.11.22", "Creat!");
        Task task2 = new Task("Project 'Library'", "01.11.22", "Creat!");
        Task task3 = new Task("Project 'Course'", "11.11.22", "Creat!");
        Task task4 = new Task("Project 'Register'", "01.11.22", "Creat!");
        Task task5 = new Task("Project 'Company'", "22.11.22", "Creat!");

        CourseDaoImpl courseDao = new CourseDaoImpl();
        InstructorDaoImpl instructorDaoimpl = new InstructorDaoImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
        TaskDaoImpl taskDao = new TaskDaoImpl();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Select Number :");
            String SelectNumber = scanner.nextLine();

            System.out.println();

            switch (SelectNumber) {
                case "1" -> courseDao.saveCourse(course1);
                case "2" -> courseDao.getCourseById(1L);
                case "3" -> courseDao.getAllCourse();
                case "4" -> courseDao.UpdateCourse(2L, course2);
                case "5" -> courseDao.deleteCourseById(1L);
                case "6" -> courseDao.getCourseByName("Peaksoft");
                case "7" -> instructorDaoimpl.SaveInstructor(instructor1);
                case "8" -> instructorDaoimpl.UpdateInstructor(1L, instructor1);
                case "9" -> instructorDaoimpl.getInstructorById(1L);
                case "10" -> instructorDaoimpl.getInstructorByCourseId(1L);
                case "11" -> instructorDaoimpl.DeleteInstructorById(1L);
                case "12" -> instructorDaoimpl.assignInstructorToCourse(course1.getId(), instructor1.getId());
                case "13" -> lessonService.SaveLesson(lesson1);
                case "14" -> lessonService.UpdateLesson(1L, lesson1);
                case "15" -> lessonService.getLessonById(1L);
                case "16" -> lessonService.getLessonsByCourseId(1L);
                case "17" -> taskDao.saveTask(task1);
                case "18" -> taskDao.getAllTaskByLessonId(1l);
                case "19" -> taskDao.deleteTaskById(2L);
                default -> System.out.println("very well");
            }

        }
    }
}
