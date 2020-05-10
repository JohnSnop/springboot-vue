package com.wf.springbootvue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wf
 * @create 2020-05-10 21:13
 * @desc
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment implements Serializable {
    @Id
    private Long id;

    private String serial;

}
