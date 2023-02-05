package com.example.restaurant.RestaurentTest_5_feb.controller;

import com.example.restaurant.RestaurentTest_5_feb.model.RestaurentModel;
import com.example.restaurant.RestaurentTest_5_feb.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurent")
public class Restcontroller {
    @Autowired
    private final RestaurentService restaurentService;
    public Restcontroller(RestaurentService restaurentService){
        this.restaurentService=restaurentService;
    }

    @GetMapping("/get-all")
    public List<RestaurentModel> getrestu(){
        return restaurentService.getAll();
    }

    @GetMapping("/get-by/name/{name}")
    public RestaurentModel getbyname(@PathVariable String name){
        return restaurentService.getbyname(name);
    }

@PostMapping("/get-by/name/{name}")
    public void addRest(@RequestBody RestaurentModel restaurentModel){
        restaurentService.addInfo(restaurentModel);
}

@PutMapping("/update-restu-by/name/{name}")
    public void updatebyname(@PathVariable String name,@RequestBody RestaurentModel restaurentModel){
        restaurentService.updatebyname(name,restaurentModel);
}

@DeleteMapping("/delete-restu-by/name/{name}")
    public void deleteByname(@PathVariable String name){
        restaurentService.deletebyname(name);
}

}
