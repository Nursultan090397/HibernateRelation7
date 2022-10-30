package peaksoft.service.impl;

import peaksoft.dao.LessonDao;
import peaksoft.dao.impl.LessonDaoImpl;
import peaksoft.entity.Lesson;
import peaksoft.service.LessonService;

import java.util.List;

public class LessonServiceImpl implements LessonService {

    LessonDao lessonDao = new LessonDaoImpl();

    @Override
    public void SaveLesson(Lesson lesson) {
        lessonDao.SaveLesson(lesson);
    }
    @Override
    public void UpdateLesson(Long id, Lesson lesson) {
        lessonDao.UpdateLesson(id, lesson);
    }
    @Override
    public Lesson getLessonById(Long id) {
        return lessonDao.getLessonById(id);
    }
    @Override
    public List<Lesson> getLessonsByCourseId(Long id) {
        return lessonDao.getLessonsByCourseId(id);
    }
}