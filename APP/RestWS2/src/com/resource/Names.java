package com.resource;


import javax.xml.bind.annotation.XmlRootElement;


public class Names {
	
	private String projectName;
	private  int projectId;
	private String projectDetails;
	private String projectHead;
	private String toolsUsed;
	private String category;
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	public String getProjectHead() {
		return projectHead;
	}
	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}
	public String getToolsUsed() {
		return toolsUsed;
	}
	public void setToolsUsed(String toolsUsed) {
		this.toolsUsed = toolsUsed;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Names [projectName=" + projectName + ", projectId=" + projectId + ", projectDetails=" + projectDetails
				+ ", projectHead=" + projectHead + ", toolsUsed=" + toolsUsed + ", category=" + category
				+ ", getProjectName()=" + getProjectName() + ", getProjectId()=" + getProjectId()
				+ ", getProjectDetails()=" + getProjectDetails() + ", getProjectHead()=" + getProjectHead()
				+ ", getToolsUsed()=" + getToolsUsed() + ", getCategory()=" + getCategory() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	}
	
	
		
	
	
	


