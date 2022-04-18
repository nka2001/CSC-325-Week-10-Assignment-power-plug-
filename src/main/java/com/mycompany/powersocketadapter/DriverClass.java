/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    
    public static void main(String[] args) {
        
        AmericanPlug usaPlug = new American230vAppliancePlug();
        
        AmericanPlug usaPlug2 = new American110vNormalPlug();//create a new american plug, this is the 110 volt version though 
        EuropeanPowerSocket eSock2 = new EuropeanPowerSocket();//create a new european socket, no difference here 
        EuropeanPlug ePlug2 = new AmericanToEuropeanPlugAdapter(usaPlug2);//create a new adapter for the 110v plug to european plug 
        
        EuropeanPowerSocket eSocket= new EuropeanPowerSocket();
        EuropeanPlug ePlug= new AmericanToEuropeanPlugAdapter(usaPlug);
        
        eSocket.plugIn(ePlug);
        eSock2.plugIn(ePlug2);//used to print the 110v version of the american plug 
    }
    
}
