package services;

import entities.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SchoolService {
	private School school;
	
	public SchoolService() {}
	
	public House sortingHat(Student sudent) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int gryffendorScore = 0, slytherinScore = 0, hufflepuffScore = 0, ravenclawScore = 0;
		
		System.out.println("Out of 5, How much you think you have courage?");
		gryffendorScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much do you consider yourself brave?");
		gryffendorScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much do you value chivalry?");
		gryffendorScore += Integer.parseInt(reader.readLine());
		
		
		System.out.println("Out of 5, How much do you consider yourself a hardworker?");
		hufflepuffScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much can you stay patient?");
		hufflepuffScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much do you consider youtself loyal?");
		hufflepuffScore += Integer.parseInt(reader.readLine());
		
		
		System.out.println("Out of 5, How clever are you?");
		ravenclawScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How creative are you?");
		ravenclawScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much do you value learning?");
		ravenclawScore += Integer.parseInt(reader.readLine());
		
		
		System.out.println("Out of 5, How much are you ambitious?");
		slytherinScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much do you consider yourself a leader?");
		slytherinScore += Integer.parseInt(reader.readLine());
		
		System.out.println("Out of 5, How much do you think you are cunning?");
		slytherinScore += Integer.parseInt(reader.readLine());
		
		
		String desiredHouse = findDesiredHouseName(gryffendorScore, hufflepuffScore, ravenclawScore, slytherinScore);
		
		return findHouse(desiredHouse, school.getHouses());
	}
	
	private String findDesiredHouseName(int gryffendorScore, int hufflepuffScore, int ravenclawScore, int slytherinScore) {
		int max = gryffendorScore;
		String desiredHouse = "Gryffendor";
		
		if(hufflepuffScore > max) {
			max = hufflepuffScore;
			desiredHouse = "Hufflepuff";
		}
		
		if(ravenclawScore > max) {
			max = ravenclawScore;
			desiredHouse = "Ravenclaw";
		}
		
		if(slytherinScore > max) {
			desiredHouse = "Slytherin";
		}
		
		return desiredHouse;
	}
	
	private House findHouse(String name, ArrayList<House> houses) {
		for(House house : houses) {
			if(name.equals(house.getName()))
				return house;
		}
		
		return null;
	}
	
	public SchoolService(School _school) {
		school = _school;
	}
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School _school) {
		school = _school;
	}
}
