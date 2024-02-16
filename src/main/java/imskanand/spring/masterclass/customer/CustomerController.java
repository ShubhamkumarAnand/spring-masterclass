package imskanand.spring.masterclass.customer;

import imskanand.spring.masterclass.MasterclassApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping
    Customer getCustomer() {
        return new Customer(1L, "imskanand");
    }
}
