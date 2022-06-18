package org.eliseev.student.model;

import javax.persistence.*;

@Entity
@Table(name = "jc_university")
public class University {
    @Id
    @Column(name = "university_id")
    private Long universityId;
    @Column(name = "university_name")
    private String universityName;

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
