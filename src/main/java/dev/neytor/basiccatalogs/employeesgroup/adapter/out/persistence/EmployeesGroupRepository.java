package dev.neytor.basiccatalogs.employeesgroup.adapter.out.persistence;

import dev.neytor.basiccatalogs.employeesgroup.adapter.out.persistence.entity.EmployeesGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "employees-groups", path = "employees-groups")
public interface EmployeesGroupRepository extends JpaRepository<EmployeesGroupEntity, Long> {
    Optional<EmployeesGroupEntity> findByCode(String code);
}