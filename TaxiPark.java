package com.hillel.HWs.TaxiPark.interfaces;

import java.util.*;
import java.lang.*;
public interface TaxiPark {
    void setCarsList(Car carsList[]);
    Car[] getCarsList();
    void setPrice(int price);
    int getPrice();
    void setCity(String city);
    String getCity();
    void setStaffQuantity(int staffQuantity);
    int gerStaffQuantity();
}
