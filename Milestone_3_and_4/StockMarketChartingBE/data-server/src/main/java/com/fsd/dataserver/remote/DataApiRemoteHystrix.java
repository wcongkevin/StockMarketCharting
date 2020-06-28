package com.fsd.dataserver.remote;

import org.springframework.stereotype.Component;

@Component
public class DataApiRemoteHystrix implements DataApiRemote{

    @Override
    public String getDataApiPort() {
        return "order service fail";
    }
}
