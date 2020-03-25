/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter.Logic;

import currencyconverter.Model.ModelProgram;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Logic {

	public Boolean checkName(String name) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9]");
		Matcher matchername = pattern.matcher(name);
		return matchername.matches();
	}

	public Boolean checkInput(String masukan) {
		Pattern pattern = Pattern.compile("[0-9]+[0-9]");
		Matcher matcherinput = pattern.matcher(masukan);
		return matcherinput.matches();
	}

	public String idr_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		String total = "IDR " + output;
		return total;
	}
	
	public String idr_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 0.000056;
		String total = "EUR " + output;
		return total;
	}
	
	public String idr_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 0.000061;
		String total = "USD " + output;
		return total;
	}
	
	public String idr_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 0.0067;
		String total = "JPY " + output;
		return total;
	}
	
	public String eur_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		String total = "EUR " + output;
		return total;
	}
	
	public String eur_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 17819;
		String total = "IDR " + output;
		return total;
	}
	
	public String eur_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 1.08;
		String total = "USD " + output;
		return total;
	}
	
	public String eur_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 119.39;
		String total = "JPY " + output;
		return total;
	}
	
	public String usd_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		String total = "USD " + output;
		return total;
	}
	
	public String usd_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 16474;
		String total = "IDR " + output;
		return total;
	}
	
	public String usd_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 0.92;
		String total = "EUR " + output;
		return total;
	}
	
	public String usd_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 110.36;
		String total = "JPY " + output;
		return total;
	}
	
	public String jpy_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		String total = "JPY " + output;
		return total;
	}
	
	public String jpy_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 149.28;
		String total = "IDR " + output;
		return total;
	}
	
	public String jpy_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * 0.0084;
		String total = "EUR " + output;
		return total;
	}
	
	public String jpy_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		String total = "USD " + output * 0.0091;
		return total;
	}
}
