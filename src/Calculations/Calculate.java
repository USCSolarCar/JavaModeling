/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;
import java.lang.Math;
/**
 *
 * @author datasource1337
 */
public class Calculate {
    
    
    public static double julianDate(int month, int day, int year, double hour){
        //Calculates Julian Date from UTC Time
        return 367*year - (7*(year + ((month+9)/12)))/4 + (275*month)/9 + day - 730530 + 2451543.5 + hour/24;
    }
    
    /*
    Days since Greenwich noon, Terrestrial Time January 1, 2000
    
    http://en.wikipedia.org/wiki/Position_of_the_Sun
    */
    public static double n(int month, int day, int year, double hour){
        return julianDate(month,day,year,hour)+2451545;
    }
    
    
    
    
    
    
}
