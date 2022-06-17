package org.eliseev.student.repository;

import org.eliseev.student.model.StudentOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentOrderRepository extends JpaRepository<StudentOrder, Long> {


}
