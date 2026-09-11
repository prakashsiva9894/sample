package com.example.moonloom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.moonloom.model.Message;
import com.example.moonloom.model.Order;
import com.example.moonloom.repository.MessageRepository;
import com.example.moonloom.repository.OrderRepository;

@Controller
public class MainController {

    @Autowired
    private MessageRepository messageRepo;

    @Autowired
    private OrderRepository orderRepo;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/submit")
    public String saveMessage(@RequestParam String name,
                              @RequestParam String email,
                              @RequestParam String message) {
        Message msg = new Message();
        msg.setName(name);
        msg.setEmail(email);
        msg.setMessage(message);

        messageRepo.save(msg);
        return "redirect:/";
    }

    @PostMapping("/buy")
    @ResponseBody
    public String buyProduct(@RequestParam String productName,
                             @RequestParam Double price) {
        Order order = new Order();
        order.setProductName(productName);
        order.setPrice(price);
        orderRepo.save(order);

        return "✅ Order Placed Successfully!";
    }
}
