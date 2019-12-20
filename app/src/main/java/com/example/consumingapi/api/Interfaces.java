package com.example.consumingapi.api;

import com.example.consumingapi.models.Employee;
import com.example.consumingapi.models.Flag;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface Interfaces {

    @GET("employees")
    Call<List<Employee>> getEmployees();

    @GET("employee/{id}")
    Call<Employee>
    getEmployeeById(@Path("id") int id);

    @POST("create")
    Call<Void> addEmployee(@Body Employee employee);

    @PUT("update/{id}")
    Call<Void> updateEmployee(@Path("id") int id, @Body Employee employee);

    @GET("singleflag/{id}")
    Call<Flag> getFlagById(@Path("id") int id);

    @Multipart //for image
    @POST("upload")
    Call<Flag> uploadFlag(@Part MultipartBody.Part img); //image file data type MultipartBody

    @POST("addcountry")
    Call<Void> addCountry(@Body Flag flag);

}
