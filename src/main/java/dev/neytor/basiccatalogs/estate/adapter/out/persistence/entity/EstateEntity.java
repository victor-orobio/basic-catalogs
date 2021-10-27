package dev.neytor.basiccatalogs.estate.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "estate")
@Entity
@Data
public class EstateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estate_id", nullable = false)
    private Long id;

    @Column(name = "estate_code", nullable = false, unique = true)
    private String code;

    @Column(name = "estate_name", nullable = false, unique = true)
    private String name;

    @Column(name = "country_code", nullable = false)
    private String countryCode;

}
