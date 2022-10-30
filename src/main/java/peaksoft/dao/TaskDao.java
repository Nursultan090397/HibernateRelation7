package peaksoft.dao;

import peaksoft.entity.Task;

public interface TaskDao {

    void saveTask(Task task);

    void updateLesson (Long id, Task task);

    Task getAllTaskByLessonId(Long id);

    void deleteTaskById(Long id);
}