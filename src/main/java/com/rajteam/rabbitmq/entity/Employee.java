package com.rajteam.rabbitmq.entity;

import com.rajteam.rabbitmq.dto.EmpRequestDto;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull(message = "code must not be null... !")
    private String code;

    @NotNull(message = "firstName must not be null... !")
    private String firstName;

    @NotNull(message = "Account number must not be null... !")
    private String accNo;

    public Employee() {
    }

    /*Copy constructor to build employee as entity*/
    public Employee(EmpRequestDto empRequestDto) {
        this.id=empRequestDto.getId();
        this.code = empRequestDto.getCode();
        this.firstName = empRequestDto.getFirstName();
        this.accNo = empRequestDto.getAccNo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
}
