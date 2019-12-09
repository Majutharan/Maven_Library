package com.codetech.multimodule.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by A Majutharan. Date: 12/2/2019 Time: 11:48 AM
 */
@ConfigurationProperties("service")
public class ServiceProperties {
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
