package org.eliseev.student.repository;

import org.eliseev.student.model.CountryArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryAreaRepository extends JpaRepository<CountryArea, String> {
}
