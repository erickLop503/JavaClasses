package com.class23;

public class ScrumTeam extends Employee{

	public String artifacts;
	public String ceremonies;
	
	public void workOnArtifacts() {
		System.out.println("Scrum Team works on "+artifacts);
	}
	
	public void attendScrumMettings() {
		System.out.println("Scrum Team attends"+ceremonies);
	}
}
