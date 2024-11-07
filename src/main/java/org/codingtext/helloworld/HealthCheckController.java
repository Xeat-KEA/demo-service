package org.codingtext.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public String healthcheck() {
        return "새로운 이미지로 변경되었나? replicaset: 7989687db7";
    }

}
