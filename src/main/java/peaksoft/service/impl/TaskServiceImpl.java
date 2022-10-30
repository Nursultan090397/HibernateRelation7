package peaksoft.service.impl;

import peaksoft.dao.TaskDao;
import peaksoft.dao.impl.TaskDaoImpl;
import peaksoft.entity.Task;
import peaksoft.service.TaskService;

public class TaskServiceImpl implements TaskService {
    TaskDao taskDao = new TaskDaoImpl();

    @Override
    public void saveTask(Task task) {
        taskDao.saveTask(task);

    }

    @Override
    public void updateLesson(Long id, Task task) {
        taskDao.updateLesson(id,task);

    }

    @Override
    public Task getAllTaskByLessonId(Long id) {
        return taskDao.getAllTaskByLessonId(id);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskDao.deleteTaskById(id);

    }
}
