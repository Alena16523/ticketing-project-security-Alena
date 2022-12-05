package com.cydeo.ticketingprojectsecurityalena.service.impl;

import com.cydeo.ticketingprojectsecurityalena.dto.RoleDTO;
import com.cydeo.ticketingprojectsecurityalena.entity.Role;
import com.cydeo.ticketingprojectsecurityalena.mapper.MapperUtil;
import com.cydeo.ticketingprojectsecurityalena.mapper.RoleMapper;
import com.cydeo.ticketingprojectsecurityalena.repository.RoleRepository;
import com.cydeo.ticketingprojectsecurityalena.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;
    private final MapperUtil mapperUtil;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper, MapperUtil mapperUtil) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        List<Role> roleList = roleRepository.findAll();
//        return roleList.stream().map(roleMapper::convertToDto).collect(Collectors.toList());
        return roleList.stream().map(role -> mapperUtil.convert(role, new RoleDTO())).collect(Collectors.toList());
//        return roleList.stream().map(role -> mapperUtil.convert(role, RoleDTO.class)).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {




        return roleMapper.convertToDto(roleRepository.findById(id).get());
    }
}
