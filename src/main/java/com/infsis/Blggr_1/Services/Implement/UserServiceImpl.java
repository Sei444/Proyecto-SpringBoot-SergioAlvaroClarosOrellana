package com.infsis.Blggr_1.Services.Implement;

import com.infsis.Blggr_1.DTOs.UserDTO;
import com.infsis.Blggr_1.Entities.User;
import com.infsis.Blggr_1.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Optional<UserDTO> getUserById(Integer userId) {

        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {

        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {

        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    public UserDTO UsertoDto(User user){
        UserDTO userDTO=new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    public User DtotoUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        return user;
    }
}
