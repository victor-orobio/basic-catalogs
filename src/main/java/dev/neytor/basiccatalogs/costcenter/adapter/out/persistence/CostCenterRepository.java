package dev.neytor.basiccatalogs.costcenter.adapter.out.persistence;

import dev.neytor.basiccatalogs.costcenter.adapter.out.persistence.entity.CostCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "cost-centers", path = "cost-centers")
@CrossOrigin(origins = "*")
public interface CostCenterRepository extends JpaRepository<CostCenterEntity, Long> {
    Optional<CostCenterEntity> findByCode(String code);
}