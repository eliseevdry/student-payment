package org.eliseev.student.repository;

import org.eliseev.student.model.RegisterOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterOfficeRepository extends JpaRepository<RegisterOffice, Long> {
}
