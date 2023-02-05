package com.example.restaurant.RestaurentTest_5_feb.service;

import com.example.restaurant.RestaurentTest_5_feb.model.RestaurentModel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RestaurentService {
    private static List<RestaurentModel> restaurent = new ArrayList<>();
    private static int id=0;
    static {
        restaurent.add(new RestaurentModel("Kalika","Lucknow",8464673,"24 hour open",20,++id));
        restaurent.add(new RestaurentModel("Haweli","Lucknow",758644,"24 hour open",40,++id));
        restaurent.add(new RestaurentModel("SerePunjab","Lucknow",853086,"24 hour open",14,++id));
        restaurent.add(new RestaurentModel("Annapurna","Lucknow",2490754,"24 hour open",25,++id));
        restaurent.add(new RestaurentModel("Milton","Lucknow",8932022,"24 hour open",50,++id));
    }
    public void addInfo(RestaurentModel restaurentModel){
        restaurent.add(restaurentModel);
    }

    public List<RestaurentModel> getAll(){
        return restaurent;
    }

    public RestaurentModel getbyname(String name){
        Predicate<? super RestaurentModel> predicate = restaurentModel -> restaurentModel.getRestName().equals(name);
        RestaurentModel restaurentModel = restaurent.stream().filter(predicate).findFirst().get();
        return restaurentModel;
    }
    public void deletebyname(String name) {
        Predicate<? super RestaurentModel> predicate = restaurentModel -> restaurentModel.getRestName().equals(name);
        restaurent.removeIf(predicate);
    }

    public void updatebyname(String name, RestaurentModel restaurentModel){
        RestaurentModel restaurentMode = getbyname(name);
        restaurentMode.setRestName(restaurentMode.getRestName());
        restaurentMode.setRestAdd(restaurentMode.getRestAdd());
        restaurentMode.setContNum(restaurentMode.getContNum());
        restaurentMode.setSpeciality(restaurentMode.getSpeciality());
        restaurentMode.setTotalStaff(restaurentModel.getTotalStaff());
        restaurentMode.setRestId(restaurentMode.getRestId());

    }
}
