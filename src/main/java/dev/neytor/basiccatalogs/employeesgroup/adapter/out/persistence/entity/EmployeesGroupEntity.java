package dev.neytor.basiccatalogs.employeesgroup.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employees_group")
@Entity
@Data
public class EmployeesGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id", nullable = false)
    private Long id;

    @Column(name = "group_code", nullable = false, length = 55)
    private String code;

    @Column(name = "group_description", nullable = false)
    private String description;
}