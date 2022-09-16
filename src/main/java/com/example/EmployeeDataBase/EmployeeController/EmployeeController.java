package com.example.EmployeeDataBase.EmployeeController;

import com.example.EmployeeDataBase.EmployeeModel.Employee;
import com.example.EmployeeDataBase.EmployeeRepo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
@CrossOrigin
@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/Employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/get-Student/{identity}")
    public Employee getSingleAddress(@PathVariable("identity") Integer id){

        return employeeRepository.findById(id).get();

    }

    @DeleteMapping("/Students/remove/{id}")
    public boolean deleteStudent(@PathVariable("id") Integer id){
        if(!employeeRepository.findById(id).equals(Optional.empty())){
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/Employees/update/{id}")
    public Employee updateEmployee(@PathVariable("id") Integer id,
                                  @RequestBody Map<String, String> body){

        Employee current = employeeRepository.findById(id).get();
        current.setFirstName(body.get("first_name"));
        current.setLastName(body.get("last_name"));
        current.setEmail(body.get("email"));
        current.setAddress(body.get("address"));
        employeeRepository.save(current);
        return current;
    }

    @PostMapping("/Employees/add")
    public Employee createStudent(@RequestBody Map<String, String> body){

        String firstname = body.get("first_name");
        String lastname = body.get("last_name");
        String email = body.get("email");
        String address = body.get("address");
        Employee newStudent = new Employee(firstname, lastname, email, address);

        return employeeRepository.save(newStudent);
    }





}
