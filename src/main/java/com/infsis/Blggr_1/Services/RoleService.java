package com.infsis.Blggr_1.Services;

import com.infsis.Blggr_1.DTOs.RoleDTO;

import java.util.Optional;

public interface RoleService {
    Optional<RoleDTO> getRoleById(Integer roleId);
    RoleDTO saveRole(RoleDTO roleDTO);
    RoleDTO updateRole(Integer roleId, RoleDTO roleDTO);
    void delete(Integer id);
}
