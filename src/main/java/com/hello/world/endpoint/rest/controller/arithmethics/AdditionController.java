package com.hello.world.endpoint.rest.controller.arithmethics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

  @GetMapping("/add")
  public Long addition(@RequestParam Long a, @RequestParam Long b) {
    return a + b;
  }
}
