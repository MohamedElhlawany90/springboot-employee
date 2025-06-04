package com.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public Employee findEmpById(Long id) {
        return empRepository.findById(id).orElse(null);
    }

    public List<Employee> findAllEmps() {
        return empRepository.findAll();
    }

    public Employee addEmp(Employee employee) {
        return empRepository.save(employee);
    }

    public Employee updateEmp(Long id, Employee updatedEmp) {
        Optional<Employee> existingEmp = empRepository.findById(id);
        if (existingEmp.isPresent()) {
            updatedEmp.setId(id);
            return empRepository.save(updatedEmp);
        } else {
            return null;
        }
    }

    public void deleteEmp(Long id) {
        empRepository.deleteById(id);
    }
}
