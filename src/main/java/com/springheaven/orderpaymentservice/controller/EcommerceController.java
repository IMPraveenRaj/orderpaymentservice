package com.springheaven.orderpaymentservice.controller;


import com.springheaven.orderpaymentservice.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    @PostMapping("/order")
    public void createOrder(@RequestParam Long customerId, @RequestParam BigDecimal amount) {
        ecommerceService.createOrderAndPayment(customerId, amount);
    }

    @GetMapping("/welcome")
    public String createOrder(){
        return "welcome we are launching";
    }


    @PostMapping("/user-interaction")
    public void logUserInteraction(@RequestParam Long userId, @RequestParam String action, @RequestParam String productId) {
        ecommerceService.logUserInteraction(userId, action, productId);
    }

    @PostMapping("/cache-product")
    public void cacheProduct(@RequestParam String productId, @RequestParam String name, @RequestParam double price, @RequestParam String availability) {
        ecommerceService.cacheProductDetails(productId, name, price, availability);
    }

    @GetMapping("/monitor")
    public Mono<String> monitoring(){

        try{
             boolean condition=true;

             while(condition){
                 Runnable run = new Runnable(){
                     @Override
                     public void run() {
                         while(true){

                         }
                     }
                 };
                 new Thread(run).start();
                 Thread.sleep(5000);
             }


        }catch (Exception e){
            return Mono.just("helloworld");
        }



            return Mono.just("helloworld");
}

}