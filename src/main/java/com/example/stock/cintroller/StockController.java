package com.example.stock.cintroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class StockController {
    @GetMapping("/api/socks")
    public String stock(
        @RequestParam(value = "color", required = false, defaultValue = "none") String color,
        @RequestParam(value = "operation", required = false, defaultValue = "none") String operation,
        @RequestParam(value = "cotton", required = false, defaultValue = "none") String cotton,
        @RequestParam(value = "type", required = false, defaultValue = "all") String type,
        Map<String, Object> model) {
        model.put("color", color);
        model.put("operation", operation);
        model.put("cotton", cotton);
        model.put("type", type);
        return "stock";
    }

    @GetMapping
    public String guestPage(Map<String, Object> model) {
        model.put("text", "Wellcome to Socks Stock");
        return "main";
    }



}
