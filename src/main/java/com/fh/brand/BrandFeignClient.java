package com.fh.brand;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "api-brand-shop",path = "api/brand")
public interface BrandFeignClient extends BrandApi {
}
