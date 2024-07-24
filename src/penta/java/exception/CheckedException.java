package penta.java.exception;

import java.io.IOException;

public class CheckedException {
	
	static void print() throws IOException // if try and catch used throws usage is optional
	{
		
		
		throw new IOException();
		
	}
	public static void main(String[] args) throws IOException
	{
	System.out.println("Starting");
	CheckedException.print();
	System.out.println("Ending");
		
	}

}
