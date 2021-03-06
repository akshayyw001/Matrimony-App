package com.example.matrimony.Network;

public interface INetworkResult <T> {

    void onSuccess(T responseBody, int responseType);

    void onError(String message);

    void callCurrentAPIWithNewToken();


}
