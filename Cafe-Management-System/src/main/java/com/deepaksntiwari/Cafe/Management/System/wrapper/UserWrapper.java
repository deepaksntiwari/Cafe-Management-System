package com.deepaksntiwari.Cafe.Management.System.wrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserWrapper {
    private Integer id;

    private String name;

    private String email;

    private String contactNumber;

    private String status;
}
