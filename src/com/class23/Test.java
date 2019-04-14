package com.class23;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("-----Creating Employee object------");
		Employee emp= new Employee();
		System.out.println(Employee.department);
		Employee.work();
		//emp.work(); not preffered way
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("---Creating ScrumTeam object----");
		ScrumTeam st= new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDwon Chart";
		st.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMettings();
		st.workOnArtifacts();
		
		System.out.println("----Creating Developer Object--------");
		Developer dev = new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMettings();
		dev.code();
		
		System.out.println("----Creating Teste Object--------");
		Tester qa = new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint Backlog";
		qa.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMettings();
        qa.test();
		
        System.out.println("----Creating Bussisness Analyst Object--------");
        BussisnessAnalyst ba = new BussisnessAnalyst();
		ba.salary=80000;
		ba.getPaid();
		ba.artifacts="Sprint Backlog";
		ba.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMettings();
        ba.writeUserStories();
	
	
        System.out.println("----Creating Scrum Master Object--------");
        ScrumMaster sm = new ScrumMaster();
        sm.salary=90000;
        sm.getPaid();
        sm.artifacts="Sprint Backlog";
        sm.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
        sm.workOnArtifacts();
        sm.attendScrumMettings();
        sm.driveScrumMeetings();
	
	
        System.out.println("----Creating Product Owner Object--------");
        ProductOwner po = new ProductOwner();
        po.salary=150000;
        po.getPaid();
        po.artifacts="Sprint Backlog";
        po.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo";
        po.workOnArtifacts();
        po.attendScrumMettings();
        po.talkToTheClient();
        po.prioritizeBacklog();
	
        
        System.out.println("---------Creating Front End--------");
	    FrontEnd fe= new FrontEnd();
	    fe.doHtml();
	    fe.code();
	    
	    System.out.println("---------Creating Back End--------");
	    BackEnd be= new BackEnd();
	    be.doSql();
	    be.code();
	    
	    
	    System.out.println("--------Creating Manual Tester------");
        ManualTester mt= new ManualTester();
        mt.testManually();
        mt.test();
        
        System.out.println("--------Creating Automation Tester------");
        AutomationTester at= new AutomationTester();
        at.codeInJava();
        at.test();
	    
	}
}
