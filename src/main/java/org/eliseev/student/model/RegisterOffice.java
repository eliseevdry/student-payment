package org.eliseev.student.model;

import javax.persistence.*;

@Entity
@Table(name = "jc_register_office")
public class RegisterOffice {
    @Id
    @Column(name = "r_office_id")
    private Long registerOfficeId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "r_office_area_id")
    private CountryArea countryArea;

    @Column(name = "r_office_name")
    private String registerOfficeName;
}
