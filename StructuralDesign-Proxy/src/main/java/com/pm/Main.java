package com.pm;

/**
 * TIP Problem: Build a rate limiting proxy for an API service. The proxy allows a maximum of 3 requests within any 10-second window. Requests beyond the limit are rejected.
 * <br> Requirements: <br>
 * Subject interface: ApiService with request(String endpoint) returning a String<br>
 * RealSubject: RealApiService that returns "Response from [endpoint]"<br>
 * Proxy: RateLimitingProxy that allows at most 3 requests per 10-second window, rejecting excess requests with "Rate limit exceeded"<br>
 */
public class Main {
    public static void main(String[] args) {
        ApiService api = new RateLimitingProxy(new RealApiService());
        System.out.println(api.request("/users"));
        System.out.println(api.request("/orders"));
        System.out.println(api.request("/products"));
        System.out.println(api.request("/inventory")); // Should be rejected
    }
}