package controller;


import dto.DateTimeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/datetimecontroller")
public class DateTimeController {

    @GetMapping("/get")
    public DateTimeResponse getCurrentDateTime() {
        return new DateTimeResponse(LocalDateTime.now());
    }
}

