package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {
    public String translateDay(String day) {
        switch (day.toLowerCase()) {
            case "lunes":
                return "monday";
            case "martes":
                return "tuesday";
            case "miercoles":
                return "wednesday";
            case "jueves":
                return "thursday";
            case "viernes":
                return "friday";
            case "sabado":
                return "saturday";
            case "domingo":
                return "sunday";         
            default:
                return "unknown";
        }
    }
}

