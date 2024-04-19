package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;
import java.util.Scanner;

public class ApiCall {

    public void connectApi(String ApiUrl){
        try {
            URL url = new URL(ApiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK){
                StringBuilder sb = new StringBuilder();
                Scanner scanner = new Scanner(connection.getInputStream());
                while (scanner.hasNext()){
                    sb.append(scanner.nextLine());
                }
                System.out.println(sb);

                ObjectMapper objectMapper = new ObjectMapper();
                OpenExCurrency OpenEx = objectMapper.readValue(String.valueOf(sb), new TypeReference<OpenExCurrency>() {
                });


                        System.out.println(OpenEx.toString());



            }else {
                System.out.println("Error in sending a GET request");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
