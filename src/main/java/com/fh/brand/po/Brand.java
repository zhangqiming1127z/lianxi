package com.fh.brand.po;


import lombok.Data;

import java.io.Serializable;

@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = 2011031871580837660L;

    private Integer id;

    private String brandName;
}
