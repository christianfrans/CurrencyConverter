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
	public String output = "0";
	private double input;
	double a = 0;
	double b = 0;
	double idr_to_eur = 0.000056;
	double idr_to_usd = 0.000061;
	double idr_to_jpy = 0.0067;
	double eur_to_idr = 17819;
	double eur_to_usd = 1.08;
	double eur_to_jpy = 119.39;
	double usd_to_idr = 16474;
	double usd_to_eur = 0.92;
	double usd_to_jpy = 110.36;
	double jpy_to_idr = 149.28;
	double jpy_to_eur = 0.0084;
	double jpy_to_usd = 0.0091;
	
	public void setInput(double input) {
		this.input = input;
	}

	public double getInput() {
		return input;
	}

	public void setIdr_to_eur(double idr_to_eur) {
		this.idr_to_eur = idr_to_eur;
	}

	public double getIdr_to_eur() {
		return idr_to_eur;
	}

	public void setIdr_to_usd(double idr_to_usd) {
		this.idr_to_usd = idr_to_usd;
	}

	public double getIdr_to_usd() {
		return idr_to_usd;
	}

	public void setIdr_to_jpy(double idr_to_jpy) {
		this.idr_to_jpy = idr_to_jpy;
	}

	public double getIdr_to_jpy() {
		return idr_to_jpy;
	}

	public void setEur_to_idr(double eur_to_idr) {
		this.eur_to_idr = eur_to_idr;
	}

	public double getEur_to_idr() {
		return eur_to_idr;
	}

	public void setEur_to_usd(double eur_to_usd) {
		this.eur_to_usd = eur_to_usd;
	}

	public double getEur_to_usd() {
		return eur_to_usd;
	}

	public void setEur_to_jpy(double eur_to_jpy) {
		this.eur_to_jpy = eur_to_jpy;
	}

	public double getEur_to_jpy() {
		return eur_to_jpy;
	}

	public void setUsd_to_idr(double usd_to_idr) {
		this.usd_to_idr = usd_to_idr;
	}

	public double getUsd_to_idr() {
		return usd_to_idr;
	}

	public void setUsd_to_eur(double usd_to_eur) {
		this.usd_to_eur = usd_to_eur;
	}

	public double getUsd_to_eur() {
		return usd_to_eur;
	}

	public void setUsd_to_jpy(double usd_to_jpy) {
		this.usd_to_jpy = usd_to_jpy;
	}

	public double getUsd_to_jpy() {
		return usd_to_jpy;
	}

	public void setJpy_to_idr(double jpy_to_idr) {
		this.jpy_to_idr = jpy_to_idr;
	}

	public double getJpy_to_idr() {
		return jpy_to_idr;
	}

	public void setJpy_to_eur(double jpy_to_eur) {
		this.jpy_to_eur = jpy_to_eur;
	}

	public double getJpy_to_eur() {
		return jpy_to_eur;
	}

	public void setJpy_to_usd(double jpy_to_usd) {
		this.jpy_to_usd = jpy_to_usd;
	}

	public double getJpy_to_usd() {
		return jpy_to_usd;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getOutput() {
		return output;
	}
	
	public void idr_to_idr(double a){
		double output = a;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void idr_to_idr(int a){
		int output = a;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void idr_to_eur(double a, double b){
		double output = a * b;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void idr_to_eur(int a,int b){
		int output = a * b;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void idr_to_usd(double a, double b){
		double output = a * b;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void idr_to_usd(int a, int b){
		int output = a * b;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void idr_to_jpy(double a, double b){
		double output = a * b;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void idr_to_jpy(int a, int b){
		int output = a * b;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void eur_to_eur(double a){
		double output = a;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void eur_to_eur(int a){
		int output = a;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void eur_to_idr(double a, double b){
		double output = a * b;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void eur_to_idr(int a,int b){
		int output = a * b;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void eur_to_usd(double a, double b){
		double output = a * b;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void eur_to_usd(int a, int b){
		int output = a * b;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void eur_to_jpy(double a, double b){
		double output = a * b;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void eur_to_jpy(int a, int b){
		int output = a * b;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void usd_to_usd(double a){
		double output = a;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void usd_to_usd(int a){
		int output = a;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void usd_to_idr(double a, double b){
		double output = a * b;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void usd_to_idr(int a,int b){
		int output = a * b;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void usd_to_eur(double a, double b){
		double output = a * b;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void usd_to_eur(int a, int b){
		int output = a * b;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void usd_to_jpy(double a, double b){
		double output = a * b;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void usd_to_jpy(int a, int b){
		int output = a * b;
		String total = "JPY " + output;
		setOutput(total);
	}
	
		public void jpy_to_jpy(double a){
		double output = a;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void jpy_to_jpy(int a){
		int output = a;
		String total = "JPY " + output;
		setOutput(total);
	}
	
	public void jpy_to_idr(double a, double b){
		double output = a * b;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void jpy_to_idr(int a,int b){
		int output = a * b;
		String total = "IDR " + output;
		setOutput(total);
	}
	
	public void jpy_to_eur(double a, double b){
		double output = a * b;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void jpy_to_eur(int a, int b){
		int output = a * b;
		String total = "EUR " + output;
		setOutput(total);
	}
	
	public void jpy_to_usd(double a, double b){
		double output = a * b;
		String total = "USD " + output;
		setOutput(total);
	}
	
	public void jpy_to_usd(int a, int b){
		int output = a * b;
		String total = "USD " + output;
		setOutput(total);
	}
}
