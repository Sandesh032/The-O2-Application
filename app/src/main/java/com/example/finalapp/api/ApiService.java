package com.example.finalapp.api;

import com.example.finalapp.model.LoginRequest;
import com.example.finalapp.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/login") // Replace "/login" with the actual endpoint path of your Spring Boot API
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);
}