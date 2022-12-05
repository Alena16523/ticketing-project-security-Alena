package com.cydeo.ticketingprojectsecurityalena.repository;

import com.cydeo.ticketingprojectsecurityalena.entity.Project;
import com.cydeo.ticketingprojectsecurityalena.entity.User;
import com.cydeo.ticketingprojectsecurityalena.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByProjectCode(String code);
    List<Project> findAllByAssignedManager(User manager);
    List<Project> findAllByProjectStatusIsNotAndAssignedManager(Status status, User assignedManager);

}
