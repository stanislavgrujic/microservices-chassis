package com.stanislavgrujic.microservicechassis.ping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PingController {

  @GetMapping(path = "/ping")
  public ResponseEntity<String> ping() {
    log.info("ping hit");
    return ResponseEntity.ok("Hello");
  }
}
