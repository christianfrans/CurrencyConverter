/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter.Model;

import currencyconverter.Currency;
import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class ModelProgram {
	Currency currency = new Currency();
	DecimalFormat angka = new DecimalFormat("###,###");
	
	public String returnInputCurrency(String Currency){
        switch(Currency){
            default:
                return "IDR ";
            case "Euro":
                return "EUR ";
            case "Dollar":
                return "USD ";
            case "Yen":
                return "JPY ";
        }
    }
}
