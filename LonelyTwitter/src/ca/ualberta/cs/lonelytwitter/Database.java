package ca.ualberta.cs.lonelytwitter;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Database
{
	private FileInputStream fis;
	private ObjectInputStream ois;
	
	public Database(FileInputStream fileIpStream, ObjectInputStream objectIpStream) {
		fis = fileIpStream;
		ois = objectIpStream;
	}
}
