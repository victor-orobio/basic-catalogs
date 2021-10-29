package dev.neytor.basiccatalogs.identificationtype.adapter.out.persistence;

import dev.neytor.basiccatalogs.identificationtype.adapter.out.persistence.entity.IdentificationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "identification-types", path = "identification-types")
@CrossOrigin(origins = "*")
public interface IdentificationTypeRepository extends JpaRepository<IdentificationTypeEntity, Long> {
    Optional<IdentificationTypeEntity> findByCode(String code);

    List<IdentificationTypeEntity> findAllByCountryCode(String countryCode);
}