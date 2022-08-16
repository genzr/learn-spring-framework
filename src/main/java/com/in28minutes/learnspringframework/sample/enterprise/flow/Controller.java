package com.in28minutes.learnspringframework.sample.enterprise.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Sending response in the right format
@RestController
public class Controller {

    @Autowired
    BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }

}

@Component
class BusinessService {

    @Autowired
    private DataService dataService;

    public long calculateSum() {
        return dataService.retrieveData().stream().reduce(0, (subtotal, element) -> subtotal + element);
    }

}

@Component
class DataService {
    public List<Integer> retrieveData() {
        return List.of(12,34,56,78,90);
    }
}