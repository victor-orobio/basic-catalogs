package dev.neytor.basiccatalogs.country.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "country")
@Entity
@Data
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Long id;

    @Column(name = "country_code", nullable = false, unique = true)
    private String code;

    @Column(name = "country_name", nullable = false, unique = true)
    private String name;

}
