package org.eliseev.student.service;

import org.eliseev.student.model.StudentOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class StudentOrderServiceTest {
    @Autowired
    private StudentOrderService service;

    @Test
    public void testService() {
        service.testSave();
        service.testGet();
    }
}