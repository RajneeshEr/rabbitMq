package com.rajteam.rabbitmq.service;

import com.rajteam.rabbitmq.dto.EmpRequestDto;
import com.rajteam.rabbitmq.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    List<Employee> findAllEmployee();
    Employee saveOrUpdate(EmpRequestDto empRequestDto) throws NoHandlerFoundException;
    Optional<Employee> findById(long id) throws EntityNotFoundException;

}
