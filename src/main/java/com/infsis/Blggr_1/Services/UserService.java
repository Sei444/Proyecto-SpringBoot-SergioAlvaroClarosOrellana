package com.infsis.Blggr_1.Services;

import com.infsis.Blggr_1.DTOs.UserDTO;
import com.infsis.Blggr_1.Entities.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {
    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saveUser(UserDTO userDTO);

    UserDTO updateUser(Integer userId, UserDTO userDTO);

    void delete(Integer id);
}
