package com.rajteam.rabbitmq.resource;

import com.rajteam.rabbitmq.dto.EmpRequestDto;
import com.rajteam.rabbitmq.entity.Employee;
import com.rajteam.rabbitmq.entity.Manager;
import com.rajteam.rabbitmq.entity.Service;
import com.rajteam.rabbitmq.repository.EmployeeRepository;
//import com.rajteam.rabbitmq.repository.ManagerRepository;
import com.rajteam.rabbitmq.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

   /* @Autowired
    private ManagerRepository managerRepository;
*/

    @PostMapping("/save")
    Employee saveOrUpdate(@Valid @RequestBody EmpRequestDto empRequestDto) throws NoHandlerFoundException {
        return employeeService.saveOrUpdate(empRequestDto);
    }

    @PostMapping("/saveemp")
    Employee save(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

   /* @PostMapping("/savemang")
    Manager saveManager(@Valid @RequestBody Manager manager, BindingResult result) {
        return managerRepository.save(manager);
    }*/

    @PostMapping("/valid")
    Manager valid(@Valid @RequestBody Manager manager) {
        System.out.println(manager);
        return new Manager();
    }

    @PostMapping("/service")
    Manager serviceWrapper(@Valid @RequestBody Service service) {
        System.out.println(service);
        return new Manager();
    }


    @GetMapping("/{id}")
    Optional<Employee> findById(@PathVariable long id){
        return employeeService.findById(id);
    }
}
