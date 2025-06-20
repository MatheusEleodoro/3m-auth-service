package com.threembank.application.mapper;

import com.threembank.domain.entity.User;
import com.threembank.interfaces.dto.RegisterUserRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        implementationName = "UserMapperApplicationImpl" )
public interface UserMapper {
    User toUser(RegisterUserRequest registerUserRequest);

    RegisterUserRequest toDto(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User partialUpdate(RegisterUserRequest registerUserRequest, @MappingTarget User user);
}