/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter.Logic;

import currencyconverter.Model.ModelProgram;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Logic extends ModelProgram{

	public Boolean checkName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
		Matcher matchername = pattern.matcher(name);
		return matchername.matches();
	}

	public String idr_to_idr(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(result);
		return total;
	}
	
	public String idr_to_eur(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getIdr_to_eur());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(result);
		return total;
	}
	
	public String idr_to_usd(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getIdr_to_usd());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(result);
		return total;
	}
	
	public String idr_to_jpy(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getIdr_to_jpy());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(result);
		return total;
	}
	
	public String eur_to_eur(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(result);
		return total;
	}
	
	public String eur_to_idr(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getEur_to_idr());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(result);
		return total;
	}
	
	public String eur_to_usd(ModelProgram modelProgram) {
		ModelProgram calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getEur_to_usd());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(result);
		return total;
	}
	
	public String eur_to_jpy(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getEur_to_jpy());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(result);
		return total;
	}
	
	public String usd_to_usd(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(result);
		return total;
	}
	
	public String usd_to_idr(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getUsd_to_idr());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(result);
		return total;
	}
	
	public String usd_to_eur(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getUsd_to_eur());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(result);
		return total;
	}
	
	public String usd_to_jpy(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getUsd_to_jpy());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(result);
		return total;
	}
	
	public String jpy_to_jpy(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(result);
		return total;
	}
	
	public String jpy_to_idr(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getJpy_to_idr());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(result);
		return total;
	}
	
	public String jpy_to_eur(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getJpy_to_eur());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(result);
		return total;
	}
	
	public String jpy_to_usd(ModelProgram modelProgram) {
		Calculation calculation = new Calculation();
		double result = calculation.calculate(modelProgram.getInput(), modelProgram.getJpy_to_usd());
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(result);
		return total;
	}
	
	public String output(ModelProgram modelProgram){
		String total = modelProgram.getOutput();
		return total;
	}
}
