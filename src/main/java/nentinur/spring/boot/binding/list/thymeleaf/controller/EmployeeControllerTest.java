package nentinur.spring.boot.binding.list.thymeleaf.controller;
import nentinur.spring.boot.binding.list.thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.apache.http.entity.ContentType.DEFAULT_BINARY;
@WebMvcTest
@EnableWebMvc
class EmployeeControllerTest {
    private static final MockMultipartFile A_FILE = new MockMultipartFile("document", null, DEFAULT_BINARY.toString()
            , "Employee Record".getBytes());

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;
}