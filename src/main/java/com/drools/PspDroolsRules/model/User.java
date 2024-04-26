package com.drools.PspDroolsRules.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private int age;
    private String riskLevel;
    private int creditScore;
    private boolean isReturningCustomer;
}
