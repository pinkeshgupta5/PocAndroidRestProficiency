package com.poc.pinkesh.infosys_telstra_poc.RestApi;



import com.poc.pinkesh.infosys_telstra_poc.Models.UserResponses;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("2iodh4vg0eortkl/facts.json")
    Call<UserResponses> getUsersContent();


}
