package com.vijay.userservice.VO;

import com.vijay.userservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithDeptVO {
    User user;
    Department department;
}
