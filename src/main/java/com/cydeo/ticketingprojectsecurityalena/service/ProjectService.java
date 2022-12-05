package com.cydeo.ticketingprojectsecurityalena.service;

import com.cydeo.ticketingprojectsecurityalena.dto.ProjectDTO;
import com.cydeo.ticketingprojectsecurityalena.dto.UserDTO;

import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProjects();
    void save(ProjectDTO dto);
    void update(ProjectDTO dto);
    void delete(String code);
    void complete(String projectCode);
    List<ProjectDTO> listAllProjectDetails();

    List<ProjectDTO> listAllNonCompletedByAssignedManager(UserDTO assignedManager);

}
