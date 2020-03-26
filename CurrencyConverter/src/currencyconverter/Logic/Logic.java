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
public class Logic {

	public Boolean checkName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
		Matcher matchername = pattern.matcher(name);
		return matchername.matches();
	}

	public Boolean checkInput(String enterInput) {
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcherinput = pattern.matcher(enterInput);
		return matcherinput.matches();
	}

	public String idr_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(output);
		return total;
	}
	
	public String idr_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getIdr_to_eur();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(output);
		return total;
	}
	
	public String idr_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getIdr_to_usd();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(output);
		return total;
	}
	
	public String idr_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getIdr_to_jpy();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(output);
		return total;
	}
	
	public String eur_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(output);
		return total;
	}
	
	public String eur_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getEur_to_idr();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(output);
		return total;
	}
	
	public String eur_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getEur_to_usd();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(output);
		return total;
	}
	
	public String eur_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getEur_to_jpy();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(output);
		return total;
	}
	
	public String usd_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(output);
		return total;
	}
	
	public String usd_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getUsd_to_idr();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(output);
		return total;
	}
	
	public String usd_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getUsd_to_eur();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(output);
		return total;
	}
	
	public String usd_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getUsd_to_jpy();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(output);
		return total;
	}
	
	public String jpy_to_jpy(ModelProgram modelProgram) {
		double output = modelProgram.getInput();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "JPY " + angka.format(output);
		return total;
	}
	
	public String jpy_to_idr(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getJpy_to_idr();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "IDR " + angka.format(output);
		return total;
	}
	
	public String jpy_to_eur(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getJpy_to_eur();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "EUR " + angka.format(output);
		return total;
	}
	
	public String jpy_to_usd(ModelProgram modelProgram) {
		double output = modelProgram.getInput() * modelProgram.getJpy_to_usd();
		DecimalFormat angka = new DecimalFormat("###,###");
		String total = "USD " + angka.format(output);
		return total;
	}
}
