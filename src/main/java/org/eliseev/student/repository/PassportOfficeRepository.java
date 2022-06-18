package org.eliseev.student.repository;

import org.eliseev.student.model.PassportOffice;
import org.eliseev.student.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportOfficeRepository extends JpaRepository<PassportOffice, Long> {
}
