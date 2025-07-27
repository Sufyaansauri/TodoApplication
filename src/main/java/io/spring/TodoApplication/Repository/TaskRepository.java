package io.spring.TodoApplication.Repository;

import io.spring.TodoApplication.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {


}
