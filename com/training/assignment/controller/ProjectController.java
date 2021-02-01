package com.training.assignment.controller;

import com.training.assignment.framework.Menu;
import com.training.assignment.service.ProjectService;

import java.util.Date;

public class ProjectController {

    public void createProject(String name, Date startDate,Date tentativeEndDate) {
     if(nameOfTheProject==null){
         System.out.println("project name is required");
         if(startDate==null){
             System.out.println("start date is required");
             if(validationIssuccess){
                 Project project =new Project(String nameOfTheprojectname,Date startDate,Date tentativeendDate);
             }
         }

     }

    }

    public void updateProject(String projectId) {

    }

    public void deleteProject(String projectId) {

    }

    public void listProject() {

    }

    public Menu showProjectMenu() {
        return projectService.showMenu();
    }

}
