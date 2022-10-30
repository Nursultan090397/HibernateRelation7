package peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import peaksoft.entity.Course;
import peaksoft.entity.Instructor;
import peaksoft.entity.Lesson;
import peaksoft.entity.Task;


import java.util.Properties;

public class Util {

    private static final SessionFactory sessionFactory = createsessionFactory();

    public static SessionFactory createsessionFactory() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "org.postgresql.Driver");
        properties.put(Environment.URL, "jdbc:postgresql://localhost:2022/postgres");
        properties.put(Environment.USER, "postgres");
        properties.put(Environment.PASS, "081262");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL, "false");

        Configuration configuration = new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Task.class);
        configuration.addAnnotatedClass(Lesson.class);
        configuration.addAnnotatedClass(Instructor.class);
        configuration.addAnnotatedClass(Course.class);

        return configuration.buildSessionFactory();

    }

}