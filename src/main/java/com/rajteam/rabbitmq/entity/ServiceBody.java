package com.rajteam.rabbitmq.entity;

import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Component
public class ServiceBody {
    @Valid
    @NotNull(message = "Service request must not be null")
    ServiceRequest serviceRequest;

}
