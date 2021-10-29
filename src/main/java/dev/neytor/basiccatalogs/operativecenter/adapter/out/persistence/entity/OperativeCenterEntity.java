package dev.neytor.basiccatalogs.operativecenter.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "operative_center")
@Entity
@Data
public class OperativeCenterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operative_center_id", nullable = false)
    private Long id;

    @Column(name = "operative_center_code", nullable = false, length = 55)
    private String code;

    @Column(name = "operative_center_description", nullable = false)
    private String description;
}