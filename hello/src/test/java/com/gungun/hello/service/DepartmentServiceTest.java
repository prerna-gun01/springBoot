package com.gungun.hello.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.gungun.hello.entity.Department;
import com.gungun.hello.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp(){
        // Department department = Department.departmentName("IT");
    }

    @Test
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String deparmentName = "IT";
        Department found = departmentService.fetchDepartmentByName(deparmentName);
        assertEquals(deparmentName, found.getDepartmentName());
    }
}
