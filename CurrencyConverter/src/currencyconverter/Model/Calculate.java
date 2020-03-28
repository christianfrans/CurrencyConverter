/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter.Model;

/**
 *
 * @author user
 */
public class Calculate extends ModelProgram{
	ModelProgram modelProgram = new ModelProgram();
	double a = modelProgram.getInput();
	
	void operationsame(){
		double a = modelProgram.getInput();
	}
	void operationidr_to_eur(double a, double b){
		b = modelProgram.idr_to_eur;
		double output = a * b;
	}
	
	void operationidr_to_usd(double a, double b){
		b = modelProgram.idr_to_usd;
		double output = a * b;
	}
	
	void operationidr_to_jpy(double a, double b){
		b = modelProgram.idr_to_jpy;
		double output = a * b;
	}
	
	void operationeur_to_idr(double a, double b){
		b = modelProgram.eur_to_idr;
		double output = a * b;
	}
	
	void operationeur_to_usd(double a, double b){
		b = modelProgram.eur_to_usd;
		double output = a * b;
	}
	
	void operationeur_to_jpy(double a, double b){
		b = modelProgram.eur_to_jpy;
		double output = a * b;
	}
	
	void operationusd_to_idr(double a, double b){
		b = modelProgram.usd_to_idr;
		double output = a * b;
	}
	
	void operationusd_to_eur(double a, double b){
		b = modelProgram.usd_to_eur;
		double output = a * b;
	}
	
	void operationusd_to_jpy(double a, double b){
		b = modelProgram.usd_to_jpy;
		double output = a * b;
	}
	
	void operationjpy_to_idr(double a, double b){
		b = modelProgram.jpy_to_idr;
		double output = a * b;
	}
	
	void operationjpy_to_eur(double a, double b){
		b = modelProgram.jpy_to_eur;
		double output = a * b;
	}
	
	void operationjpy_to_usd(double a, double b){
		b = modelProgram.jpy_to_usd;
		double output = a * b;
	}
}
