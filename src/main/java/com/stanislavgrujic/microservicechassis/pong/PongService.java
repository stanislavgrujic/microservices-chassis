package com.stanislavgrujic.microservicechassis.pong;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PongService {

  private PongClient client;

  public PongService(PongClient client) {
    this.client = client;
  }

  @HystrixCommand(fallbackMethod = "fallback")
  public String callPong() {
    log.info("Call pong.");
    return client.pong();
  }

  private String fallback() {
    log.warn("Fallback method for 'pong' invoked.");
    return " - pong failed";
  }
}
