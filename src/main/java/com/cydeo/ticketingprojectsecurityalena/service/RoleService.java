package com.cydeo.ticketingprojectsecurityalena.service;

import com.cydeo.ticketingprojectsecurityalena.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id);
}
