package com.drools.PspDroolsRules.service;

import com.drools.PspDroolsRules.model.Deposit;
import com.drools.PspDroolsRules.model.User;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PspDroolsService {

    @Autowired
    private KieContainer kieContainer;

    public Deposit processApplication(User user) {
        Deposit deposit = new Deposit();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("deposit", deposit);
        kieSession.insert(user);
        kieSession.fireAllRules();
        kieSession.dispose();
        return deposit;

    }
}
