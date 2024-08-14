package com.java.realtime.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.java.realtime.dto.EmployeeDto;
import com.java.realtime.entity.Employee;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee mapEmployeetDTOToEmployee(EmployeeDto employeeDto);
    EmployeeDto mapEmployeeToEmployeeDto(Employee employee);

}

