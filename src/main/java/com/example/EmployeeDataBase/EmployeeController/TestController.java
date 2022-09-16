package com.example.EmployeeDataBase.EmployeeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String helloWorld(){
        return "Hello";
    }

    @RequestMapping("/index")
    public String welcome(){ //function name cannot be the same as the request mapping.
        return "EmployeesIndex.html";
    }

    @RequestMapping("/update")
    public String welcome2(){ //function name cannot be the same as the request mapping.
        return "UpdateEmployee.html";
    }


    @RequestMapping("/admin")
    public String adminPage(){
        return "EmployeeDataBase.html";
    }


}




