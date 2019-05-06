package com.stanislavgrujic.microservicechassis.ping;

import com.stanislavgrujic.microservicechassis.pong.PongService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PingController {

  private PongService pongService;

  public PingController(PongService pongService) {
    this.pongService = pongService;
  }

  @GetMapping(path = "/ping")
  public ResponseEntity<String> ping() {
    log.info("ping hit");
    return ResponseEntity.ok("ping");
  }

  @GetMapping(path = "/pingpong")
  public ResponseEntity<String> pingPong() {
    log.info("ping pong hit");
    String result = "ping" + pongService.callPong();
    return ResponseEntity.ok(result);
  }
}
