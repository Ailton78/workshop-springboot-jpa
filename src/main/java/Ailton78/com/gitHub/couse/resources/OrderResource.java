package Ailton78.com.gitHub.couse.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ailton78.com.gitHub.couse.entities.Order;
import Ailton78.com.gitHub.couse.services.OrderService;

@RestController
@RequestMapping(path = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>>findAll(){
        List<Order> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable(value = "id") Long id){
    	Order obj = orderService.findById(id);
    	return ResponseEntity.ok().body(obj);
    }


}
