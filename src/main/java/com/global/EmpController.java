package com.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/{id}")
    public Employee findEmpById(@PathVariable("id") Long id) {
        return empService.findEmpById(id);
    }

    @GetMapping
    public List<Employee> findAllEmps() {
        return empService.findAllEmps();
    }

    @PostMapping
    public Employee addEmp(@RequestBody Employee employee) {
        return empService.addEmp(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmp(@PathVariable("id") Long id, @RequestBody Employee updatedEmp) {
        return empService.updateEmp(id, updatedEmp);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable("id") Long id) {
        empService.deleteEmp(id);
        return ResponseEntity.ok("Delete Success");
    }

}
