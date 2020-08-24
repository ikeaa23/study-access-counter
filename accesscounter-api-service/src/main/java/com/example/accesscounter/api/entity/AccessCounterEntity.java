package com.example.accesscounter.api.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("access")
@Data
public class AccessCounterEntity {

    @Id
    private Integer id;

    private Integer accessCount;
}
