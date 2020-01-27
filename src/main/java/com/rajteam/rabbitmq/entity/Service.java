package com.rajteam.rabbitmq.entity;

import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Component
public class Service {

    @Valid
    @NotNull(message = "Service body can be null")
    ServiceBody serviceBody;

    @Valid
    @NotNull(message = "ServiceHeader body can be null")
    ServiceHeader serviceHeader;

}
