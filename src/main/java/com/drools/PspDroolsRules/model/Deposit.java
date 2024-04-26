package com.drools.PspDroolsRules.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Deposit {
    private double amount;
    private String currency;
    private String paymentMethod;
}
