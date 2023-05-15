package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
public class CommonBo {
    @Column(name = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "is_deleted")
    private Integer isDeleted;
}
