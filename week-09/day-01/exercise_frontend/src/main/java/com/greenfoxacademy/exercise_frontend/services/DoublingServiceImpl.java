package com.greenfoxacademy.exercise_frontend.services;

import org.springframework.stereotype.Service;

@Service
public class DoublingServiceImpl implements DoublingService {

  @Override
  public Integer doubling(Integer input) {
    return input * 2;
  }
}
