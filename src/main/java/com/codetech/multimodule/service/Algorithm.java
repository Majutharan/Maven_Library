package com.codetech.multimodule.service;

import org.springframework.stereotype.Service;

/**
 * Created by A Majutharan. Date: 12/2/2019 Time: 2:42 PM
 */
@Service
public class Algorithm {
  public int sumArrayInt(int [] array) {
    int sum = 0;
    for (int i : array) {
      sum += i;
    }
    return  sum;
  }

}
