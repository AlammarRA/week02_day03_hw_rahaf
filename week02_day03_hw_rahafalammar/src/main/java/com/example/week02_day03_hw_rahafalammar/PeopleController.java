package com.example.week02_day03_hw_rahafalammar;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PeopleController {

    ArrayList<String> names=new ArrayList<>();

    @RequestMapping(path = "/name", method = RequestMethod.GET)
    public ArrayList getNames(){
        return names;
    }


    @RequestMapping(path = "/name", method = RequestMethod.POST)
    public String addNames(@RequestBody String name){
        names.add(name);
        return "New name added to the list";
    }

    @RequestMapping(path = "/name/{index}", method = RequestMethod.PUT)
    public String updateName(@PathVariable int index, @RequestBody String newName){
        names.set(index,newName);
        return "Name updated";
    }

    @RequestMapping(path = "/name/{index}", method = RequestMethod.DELETE)
    public String deleteName(@PathVariable int index){
        names.remove(index);
        return "Name deleted from the list";
    }

}
