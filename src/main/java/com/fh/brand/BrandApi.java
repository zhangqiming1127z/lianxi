package com.fh.brand;

import com.fh.brand.po.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.utils.ServerResponse;



public interface BrandApi {
    @GetMapping
    public ServerResponse<Brand> findBrands(@PathVariable("id") Integer id);


}
