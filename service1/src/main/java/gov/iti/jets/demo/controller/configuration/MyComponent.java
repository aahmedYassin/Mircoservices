package gov.iti.jets.demo.controller.configuration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

 

@Component
public class MyComponent {

 

    @Autowired
    private DiscoveryClient discoveryClient;

 

    public void discoverServices() {
        List<ServiceInstance> instances = discoveryClient.getInstances("service2");
        instances.forEach((a)->System.out.println(a.toString()));
        // Iterate over instances and perform necessary actions
    }
}