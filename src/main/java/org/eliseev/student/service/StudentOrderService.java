package org.eliseev.student.service;

import org.eliseev.student.model.Address;
import org.eliseev.student.model.Person;
import org.eliseev.student.model.Street;
import org.eliseev.student.model.StudentOrder;
import org.eliseev.student.repository.StreetRepository;
import org.eliseev.student.repository.StudentOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentOrderService {

    public static final Logger LOGGER = LoggerFactory.getLogger(StudentOrderService.class);
    private final StudentOrderRepository studentOrderRepository;
    private final StreetRepository streetRepository;

    public StudentOrderService(StudentOrderRepository studentOrderRepository, StreetRepository streetRepository) {
        this.studentOrderRepository = studentOrderRepository;
        this.streetRepository = streetRepository;
    }


    @Transactional
    public void testSave() {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setHusband(buildPerson(false));
        studentOrder.setWife(buildPerson(true));
        studentOrderRepository.save(studentOrder);
    }

    @Transactional
    public void testGet() {
        List<StudentOrder> sos = studentOrderRepository.findAll();
        LOGGER.info(sos.get(0).getWife().getGivenName());
    }

    private Person buildPerson(boolean isWife) {
        Person person = new Person();
        person.setDateOfBirth(LocalDate.now());

        Address address = new Address();
        address.setPostCode("190000");
        address.setBuilding("21");
        address.setExtension("B");
        address.setApartment("199");
        Street one = streetRepository.getOne(1L);
        address.setStreet(one);

        person.setAddress(address);

        if (isWife) {
            person.setSurName("Petrova");
            person.setGivenName("Elena");
            person.setPatronymic("Vasilievna");
        } else {
            person.setSurName("Petrov");
            person.setGivenName("Ivan");
            person.setPatronymic("Ruricovich");
        }
        return person;
    }


}
