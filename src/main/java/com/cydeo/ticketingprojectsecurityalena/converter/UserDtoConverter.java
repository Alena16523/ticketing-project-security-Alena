package com.cydeo.ticketingprojectsecurityalena.converter;

import com.cydeo.ticketingprojectsecurityalena.dto.UserDTO;
import com.cydeo.ticketingprojectsecurityalena.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesBinding
public class UserDtoConverter implements Converter<String, UserDTO> {


    UserService userService;

    public UserDtoConverter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO convert(String source) {

        if (source == null || source.equals("")) {
            return null;
        }

        return userService.findByUserName(source);

    }

}
