// package com.gungun.hello.repository;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
// import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

// @DataJpaTest
// class DepartmentRepositoryTest {
//     /**
//      * 
//      */
//     @Test
//     void testFindByDepartmentNameIgnoreCase() {

//         @Autowired
//         private DepartmentRepository departmentRepository;

//         @Autowired
//         private TestEntityManager entityManager;

//         @BeforeEach
//         void setUp(){
            
//         }

//         @Test
//         public void whenFindById_thenReturnDepartment(){
//             Department department = departmentRepository.findById(1L).get();
//             assertEquals(department.getDepartmentName(), null);
//         }
//     }
// }
