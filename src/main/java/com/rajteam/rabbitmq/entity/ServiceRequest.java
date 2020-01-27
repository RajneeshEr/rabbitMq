package com.rajteam.rabbitmq.entity;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Component
public class ServiceRequest {

    @NotBlank
    private List<String> mtnsList;

    @NotBlank
    private Integer noOfCounts;

    @NotBlank
    private String rosettaStone;
}
