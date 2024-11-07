package org.codingtext.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {
    @GetMapping
    public String healthcheck() {
        return "apply만 사용해서 새로운 이미지 업데이트 가능?";
    }

}
