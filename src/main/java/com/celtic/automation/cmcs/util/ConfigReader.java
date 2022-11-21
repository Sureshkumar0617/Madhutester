package com.celtic.automation.cmcs.util;

import java.io.FileInputStream;import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String URL;
	public  Properties prop;


	public  Properties init_prop() throws IOException {
		prop = new Properties();
		FileInputStream ip = null ;
		try {
		ip	= new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
		return prop;
	}
	
	public   String readjson() throws IOException {
		return init_prop().getProperty("readjson");
	}
	
	public   String readBrowser() throws IOException {
		return init_prop().getProperty("browser");
	}
	
	public   String readLoginURL() throws IOException {
		return init_prop().getProperty("loginURL");
	}
	
	public   String readuserid() throws IOException {
		return init_prop().getProperty("userid");
	}
	public   String readpswrd() throws IOException {
		return init_prop().getProperty("pswrd");
	}
	public  String readTestSuiteDirectory() throws Exception {
	try{
		return init_prop().getProperty("testSuiteDirectory");         
	}
	catch (Exception e){
		e.printStackTrace();
	throw e;
	}
	}
	public  String readLoginEmpId() throws Exception {
		try
		{
			return init_prop().getProperty("LoginEmpId");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readAmendVehicleCondition() throws Exception {
		try
		{
			return init_prop().getProperty("AmendVehicleCondition");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readDeleteVehicleCondition() throws Exception {
		try
		{
			return init_prop().getProperty("DeleteVehicleCondition");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String getApplicationName() throws Exception {
		try
		{
			return init_prop().getProperty("ApplicationName");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public   String readJdbcDriver() throws Exception {
		try
		{
			return init_prop().getProperty("ApplicationName");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String getOS() throws Exception {
		try
		{
			return init_prop().getProperty("OS");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}

	public  String getEnvironment() throws Exception {
		try
		{
			return init_prop().getProperty("Environment");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}

	public  String writeexcel() throws Exception {
		try
		{
			return init_prop().getProperty("writeExcel");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	
	public   String readRWCexcel() throws Exception {
		try
		{
			return init_prop().getProperty("RWCexcel");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readRINexcel() throws Exception {
		try
		{
			return init_prop().getProperty("RINexcel");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	
	public  String readLoginInternalUser() throws Exception {
		try
		{
			return init_prop().getProperty("LoginInternalUser");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	
	public  String readLoginServiceProvider1() throws Exception {
		try
		{
			return init_prop().getProperty("LoginServiceProvider1");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readLoginServiceProvider2() throws Exception {
		try
		{
			return init_prop().getProperty("LoginServiceProvider2");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readLoginExternaluser1() throws Exception {
		try
		{
			return init_prop().getProperty("LoginExternaluser1");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readLoginExternaluser2() throws Exception {
		try
		{
			return init_prop().getProperty("LoginExternaluser2");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readPassedScreenshotFile() throws Exception {
		try
		{
			return init_prop().getProperty("ScreenshotPass");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readFailedScreenshotFile() throws Exception {
		try
		{
			return init_prop().getProperty("ScreenshotFail");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}
	public  String readDownloadFolder() throws Exception {
		try
		{
			return init_prop().getProperty("DownloadFolder");
		}
		catch (Exception e){
			e.printStackTrace();
		throw e;
		}
		}

	}
