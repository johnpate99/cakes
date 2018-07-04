package com.cakeregistry.cake.controllers;

import com.cakeregistry.cake.model.Cake;
import com.cakeregistry.cake.repositories.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cakes")
public class CakeController {
  @Autowired
  private CakeRepository cakeRepository;

  @GetMapping
  public List<Cake> list() {
        return cakeRepository.findAll();
    }

  @PostMapping
  public void create(@RequestBody Cake cake){
        cakeRepository.save(cake);
  }

}
