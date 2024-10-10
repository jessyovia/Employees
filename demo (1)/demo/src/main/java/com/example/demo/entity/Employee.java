package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "JWorld")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @NotNull(message = "Date of birth is required")
    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dob;

    @NotBlank(message = "Department is required")
    @Column(name = "department", nullable = false)
    private String department;

    @NotBlank(message = "Position is required")
    @Column(name = "position", nullable = false)
    private String position;

    @NotNull(message = "Salary is required")
    @Min(value = 1000, message = "Salary must be at least 1000")
    @Column(name = "salary")
    private Double salary;

    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotNull(message = "Employment date is required")
    @Temporal(TemporalType.DATE)
    @Column(name = "employment_date")
    private Date employmentDate;

    private String pensionManger;
    private String address;
    private String hmoId;
    private String nok;

    @JoinColumn(name = "refereeId",referencedColumnName = "id")
    private EmployeeReferee referee;
}
