package dev.neytor.basiccatalogs.country.adapter.out.persistence;

import dev.neytor.basiccatalogs.country.adapter.out.persistence.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
@CrossOrigin(origins = "*")
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
    List<CountryEntity> findByCode(String code);
}
