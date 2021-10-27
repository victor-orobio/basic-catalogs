package dev.neytor.basiccatalogs.city.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "city")
@Entity
@Data
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false)
    private Long id;

    @Column(name = "city_code", nullable = false, unique = true)
    private String code;

    @Column(name = "city_name", nullable = false, unique = true)
    private String name;

    @Column(name = "estate_code", nullable = false)
    private String estateCode;

    @Column(name = "country_code", nullable = false)
    private String countryCode;
}
