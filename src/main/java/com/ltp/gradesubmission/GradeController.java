package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class GradeController {

  private static List<Grade> grades= new ArrayList<>();

  @GetMapping("grades")
  public String getGrades(Model model){
    Grade grade = new Grade("Ade-Alao James", "Mathematics", "A+");
    model.addAttribute("grade", grade);
    return "grades";
  }

  @GetMapping("{id}")
  public int findGrade(@PathVariable String id, Model model){
    for(Grade grade: grades){
      if(grade.getId().equals(id)){
        model.addAttribute("grade", grade);
        return 1;
      }
    }
    return Constants.NOT_FOUND;
  }

}
