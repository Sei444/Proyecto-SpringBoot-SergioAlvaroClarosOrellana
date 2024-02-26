package com.infsis.Blggr_1.Services.Implement;

import com.infsis.Blggr_1.DTOs.RoleDTO;
import com.infsis.Blggr_1.Entities.Role;
import com.infsis.Blggr_1.Services.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public Optional<RoleDTO> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO roleDTO) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    public RoleDTO RoletoDto(Role role){
        RoleDTO roleDTO = new RoleDTO(
                role.getId(),
                role.getName()
        );
        return roleDTO;
    }

    public Role DtotoRole(RoleDTO roleDTO){
        Role role = new Role();
        role.setName(roleDTO.getName());
        return role;
    }
}
