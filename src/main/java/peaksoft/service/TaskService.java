package peaksoft.service;

import peaksoft.entity.Task;

public interface TaskService {
    void saveTask(Task task);
    void updateLesson (Long id, Task task);

    Task getAllTaskByLessonId(Long id);

    void deleteTaskById (Long id);

}

