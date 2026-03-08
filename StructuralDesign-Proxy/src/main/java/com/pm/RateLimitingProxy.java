package com.pm;

import java.util.ArrayList;
import java.util.List;

public class RateLimitingProxy implements ApiService {


    private final ApiService realApiService;
    private final List<Long> timeStampOfReqeusts;
    private final int MAX_REQUEST = 3;
    private final long TIMEOUT_WINDOW = 10000;


    public RateLimitingProxy(ApiService apiService) {
        this.realApiService = apiService;
        this.timeStampOfReqeusts = new ArrayList<>();
    }

    @Override
    public String request(String endpoint) {
        long currentTime = System.currentTimeMillis();
        timeStampOfReqeusts.removeIf(t-> currentTime-t > TIMEOUT_WINDOW);
        if(timeStampOfReqeusts.size() >= MAX_REQUEST) {
            return "Rate limit exceeded. Try again later.";
        }
        timeStampOfReqeusts.add(currentTime);
        return realApiService.request(endpoint);
    }


}
