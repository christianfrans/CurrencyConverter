/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter.Logic;

import currencyconverter.Model.ModelProgram;

/**
 *
 * @author user
 */
public class Calculation extends ModelProgram{
	
	@Override
	public double calculate(double a){
		return a;
	}
	
	public double calculate(double a, double b){
		return a * b;
	}
}
