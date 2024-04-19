package org.example;

public class Main {
    public static void main(String[] args) {

        ApiCall apiCall = new ApiCall();

        System.out.println("Making a Api Call to Open Exchange Rates using JAVA");

        apiCall.connectApi("https://openexchangerates.org/api/latest.json?app_id=234639869a554c58b3e4f879129c4186");


        /**
         * Using GET method
         * I get an error Unrecognized field, to combat this error we need @JsonIgnoreProperties(ignoreUnknown = true)
         * to ignore the rest of the values in the api
         */








    }
}