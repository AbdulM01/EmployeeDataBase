package com.example.EmployeeDataBase.EmployeeModel;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@ToString
@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "first_name")
    private @Setter String FirstName;
    @Column(name = "last_name")
    private @Setter String LastName;
    @Column(name = "email")
    private @Setter String Email;
    @Column(name = "address")
    private @Setter String Address;


    public Employee(String firstName, String lastName, String email, String address) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Address = address;
    }
}
