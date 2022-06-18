package org.eliseev.student.model;

import javax.persistence.*;

@Entity
@Table(name = "jc_passport_office")
public class PassportOffice {
    @Id
    @Column(name = "p_office_id")
    private Long passportOfficeId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "p_office_area_id")
    private CountryArea countryArea;

    @Column(name = "p_office_name")
    private String passportOfficeName;

    public Long getPassportOfficeId() {
        return passportOfficeId;
    }

    public void setPassportOfficeId(Long passportOfficeId) {
        this.passportOfficeId = passportOfficeId;
    }

    public CountryArea getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(CountryArea countryArea) {
        this.countryArea = countryArea;
    }

    public String getPassportOfficeName() {
        return passportOfficeName;
    }

    public void setPassportOfficeName(String passportOfficeName) {
        this.passportOfficeName = passportOfficeName;
    }
}
