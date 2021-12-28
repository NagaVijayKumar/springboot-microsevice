package com.vijay.departmentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Transient
    public static final String SEQUENCE_NAME = "department_sequence";
    @Id
    private long deptId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
