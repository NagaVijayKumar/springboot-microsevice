package com.vijay.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private long deptId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
