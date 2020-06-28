package com.fsd.dataserver.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "data-api-service:5100", fallback = DataApiRemoteHystrix.class)
public interface DataApiRemote {
    @GetMapping("/test/getPort")
    String getDataApiPort();
}
