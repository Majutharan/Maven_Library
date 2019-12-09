package com.codetech.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by A Majutharan. Date: 12/2/2019 Time: 12:08 PM
 */

@SpringBootTest("service.message=Hello")
public class MyServiceTest {

  @Autowired
  private MyService myService;

  @Test
  public void contextLoads() {
    assertThat(myService.message()).isNotNull();
  }

  @SpringBootApplication
  static class TestConfiguration {

  }

}
