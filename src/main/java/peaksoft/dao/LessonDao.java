package peaksoft.dao;

import peaksoft.entity.Lesson;

import java.util.List;

public interface LessonDao {
    void SaveLesson(Lesson lesson);

    void UpdateLesson(Long id, Lesson lesson);

    Lesson getLessonById(Long id);

    List<Lesson> getLessonsByCourseId(Long id);
}