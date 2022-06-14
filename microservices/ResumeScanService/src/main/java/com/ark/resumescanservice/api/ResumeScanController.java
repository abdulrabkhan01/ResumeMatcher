package com.ark.resumescanservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class used for scanning the resume which are present in PDF format
 */
@RestController
public class ResumeScanController {

    @GetMapping("/")
    public String test() {
        return "Hello ARK, your app is running";
    }
}
