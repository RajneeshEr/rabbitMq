package com.rajteam.rabbitmq.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Component
public class Manager {

   /* @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;*/

    @NotNull(message = "code must not be null... !")
    private Integer code;

    @NotEmpty(message = "firstName must not be null... !")
    private String firstName;

    @NotNull(message = "Account number must not be null... !")
    private Integer accNo;

    //@Valid
    private List<@NotEmpty(message = "Phone number must not be blank... !") String> phone;

    /*@ElementCollection(targetClass=StaffingParter.class)*/
    @Valid
    @NotNull(message = "Staffing parter must not null ")
    private Set<StaffingParter> staffingParterList;

    public Manager() {
    }

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public void setAccNo(Integer accNo) {
        this.accNo = accNo;
    }

    public Set<StaffingParter> getStaffingParterList() {
        return staffingParterList;
    }

    public void setStaffingParterList(Set<StaffingParter> staffingParterList) {
        this.staffingParterList = staffingParterList;
    }
    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
}
