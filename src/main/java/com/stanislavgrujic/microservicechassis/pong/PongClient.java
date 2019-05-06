package com.stanislavgrujic.microservicechassis.pong;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("pong-service")
public interface PongClient {

  @RequestMapping(method = RequestMethod.GET, path = "/pong")
  String pong();
}
