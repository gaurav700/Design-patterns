package com.pm;

public class RealApiService implements ApiService {
    @Override
    public String request(String endpoint) {
        return "Response from " + endpoint;
    }
}