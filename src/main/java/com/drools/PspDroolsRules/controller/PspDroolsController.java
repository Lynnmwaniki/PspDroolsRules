package com.drools.PspDroolsRules.controller;

import com.drools.PspDroolsRules.model.User;
import com.drools.PspDroolsRules.service.PspDroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pspDroolsService")
public class PspDroolsController {

    @Autowired
    private PspDroolsService pspDroolsService;

    @PostMapping("/processApplication")
    public ResponseEntity<Double> processApplication(@RequestBody User request){
        double depositAmount = pspDroolsService.processApplication(request).getAmount();
        return new ResponseEntity<>(depositAmount, HttpStatus.OK);
    }

}
//double depositAmount = pspDroolsService.processApplication(user).getAmount();