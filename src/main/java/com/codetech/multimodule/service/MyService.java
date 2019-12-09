package com.codetech.multimodule.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * Created by A Majutharan. Date: 12/2/2019 Time: 11:48 AM
 */
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {
  private final ServiceProperties serviceProperties;

  public MyService(ServiceProperties serviceProperties) {
    this.serviceProperties = serviceProperties;
  }

  public String message() {
    return this.serviceProperties.getMessage();
  }

}
