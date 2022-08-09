package com.example.week02_day03_hw_rahafalammar;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class GradeController {

    ArrayList<String> grades=new ArrayList<>();

    @RequestMapping(path = "/grade", method = RequestMethod.GET)
    public ArrayList getGrade(){
        return grades;
    }


    @RequestMapping(path = "/grade", method = RequestMethod.POST)
    public String addGrade(@RequestBody String grade){
        grades.add(grade);
        return "New grade added to the list";
    }

    @RequestMapping(path = "/grade/{index}", method = RequestMethod.PUT)
    public String updateGrade(@PathVariable int index, @RequestBody String newGrade){
        grades.set(index,newGrade);
        return "Grade updated";
    }

    @RequestMapping(path = "/grade/{index}", method = RequestMethod.DELETE)
    public String deleteGrade(@PathVariable int index){
        grades.remove(index);
        return "Grade deleted from the list";
    }
}
