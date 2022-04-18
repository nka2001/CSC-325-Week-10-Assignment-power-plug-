/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author nicka
 * finish this, just like 230v 
 */
public class American110vNormalPlug implements AmericanPlug {

    @Override
    public void givePower() {
        
        System.out.println("This is a 110 v 15 amp design");//used to print the different versions of the american plug
    }
    
}
