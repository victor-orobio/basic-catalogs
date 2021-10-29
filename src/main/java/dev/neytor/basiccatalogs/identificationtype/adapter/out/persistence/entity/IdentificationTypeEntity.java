package dev.neytor.basiccatalogs.identificationtype.adapter.out.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "identification_type")
@Entity
@Data
public class IdentificationTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identification_type_id", nullable = false)
    private Long id;

    @Column(name = "identification_type_code", nullable = false, unique = true)
    private String code;

    @Column(name = "identification_type_description", nullable = false, unique = true)
    private String description;

    @Column(name = "country_code", nullable = false)
    private String countryCode;

}
