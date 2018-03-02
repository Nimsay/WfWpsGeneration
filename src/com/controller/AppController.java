package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.facade.MyAppInterface;

public class AppController implements MyAppInterface {
	
	public String getFileName(){
		
		return "LocalAdd";
		
	}
	
	public List<String> getLocalWpsList(){
		
		ArrayList <String> localWpsList = new ArrayList<String>();
		localWpsList.add("add1");
		localWpsList.add("add2");
		return localWpsList;
		
		
	}
	
	public List<String> getRemoteWpsList(){
		
		ArrayList <String> remoteWpsList = new ArrayList<String>();
		remoteWpsList.add("add");
		
		return remoteWpsList;
		
		
	}
	public List<String> getWorkFlowList(){
		
		ArrayList <String> listWorkflow = new ArrayList<String>();
		listWorkflow.add("doubleLocalAdd");
		return listWorkflow;
	}
	
	public String getSelectedWPS(){
		
		
		return"add1";
	}
	
	public String getSelectedWorkFlow(){
		
		
		return"doubleAdd";
	}
	
	
	public String generate(){
		
		
		return "Code generated successfully!";
	}
	

}
