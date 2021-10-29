package dev.neytor.basiccatalogs.costcenter.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "cost_center")
@Entity
@Data
public class CostCenterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cost_center_id", nullable = false)
    private Long id;

    @Column(name = "cost_center_code", nullable = false, length = 55)
    private String code;

    @Column(name = "cost_center_description", nullable = false)
    private String description;
}