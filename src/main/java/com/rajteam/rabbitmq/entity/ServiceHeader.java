package com.rajteam.rabbitmq.entity;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@Component
public class ServiceHeader {

    @NotBlank
    private String clientId;

    @NotBlank
    private String userId;

}
