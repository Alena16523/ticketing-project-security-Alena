package com.cydeo.ticketingprojectsecurityalena.service;

import com.cydeo.ticketingprojectsecurityalena.dto.ProjectDTO;
import com.cydeo.ticketingprojectsecurityalena.dto.TaskDTO;
import com.cydeo.ticketingprojectsecurityalena.dto.UserDTO;
import com.cydeo.ticketingprojectsecurityalena.enums.Status;

import java.util.List;

public interface TaskService {

    List<TaskDTO> listAllTasks();
    void save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(Long id);
    TaskDTO findById(Long id);
    int totalNonCompletedTask(String projectCode);
    int totalCompletedTask(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);

    void completeByProject(ProjectDTO projectDTO);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);
    List<TaskDTO> listAllTasksByStatus(Status status);

    List<TaskDTO> listAllNonCompletedByAssignedEmployee(UserDTO assignedEmployee);

}
