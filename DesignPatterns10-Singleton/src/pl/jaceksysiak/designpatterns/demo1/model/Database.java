package pl.jaceksysiak.designpatterns.demo1.model;

public class Database {
	
	private static Database instance = new Database();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	/*
	private static Database instanceOld;
	
	public static Database getInstanceOld() {
		if(instanceOld == null) {
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
	*/

}
