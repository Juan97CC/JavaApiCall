package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenExCurrency {
    String base;

    Map<String, Double> rates;


    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }


    @Override
    public String toString() {
        return "Currency{" +
                "base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }
}
