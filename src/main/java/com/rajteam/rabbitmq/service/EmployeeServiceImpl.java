package com.rajteam.rabbitmq.service;

import com.rajteam.rabbitmq.dto.EmpRequestDto;
import com.rajteam.rabbitmq.entity.Employee;
import com.rajteam.rabbitmq.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveOrUpdate(EmpRequestDto empRequestDto) throws NoHandlerFoundException {
        Employee employee=new Employee(empRequestDto);
        Employee employee1=employeeRepository.save(employee);
        if (employee1 != null){
            throw new NoHandlerFoundException("POST","api/save", new HttpHeaders());
        }
        return employee;
    }

    @Override
    public Optional<Employee> findById(long id) throws EntityNotFoundException{
        Optional<Employee> empFindbyId = employeeRepository.findById(id);
        if (!empFindbyId.isPresent()){
            throw new EntityNotFoundException("Employee was not found for parameters {id="+id+"}");
        }
        return empFindbyId;
    }
}
