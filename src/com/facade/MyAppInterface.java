package com.facade;

import java.util.List;

public interface MyAppInterface {
	
	
	public String getFileName();
	
	public List<String> getLocalWpsList();
	
	public List<String> getRemoteWpsList();
	
	public List<String> getWorkFlowList();
	
	public String getSelectedWPS();
	
	public String getSelectedWorkFlow();
	
	public String generate();
	

}
