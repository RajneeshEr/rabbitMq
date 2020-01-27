package com.rajteam.rabbitmq.dto;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/*
* This class will responsible for handling request for employee entity,
* Handle all request validation, field and data type as well
* */
@Component
public class EmpRequestDto {

    Long id;

    @NotNull(message = "code must not be null... !")
    @NotBlank(message = "code must not be blank... !")
    //TODO required
    private String code;

    @NotNull(message = "firstName must not be null... !")
    private String firstName;

    @NotNull(message = "Account number must not be null... !")
    //TODO -- Pattern regex  -
    private String accNo;


    public EmpRequestDto() {
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
