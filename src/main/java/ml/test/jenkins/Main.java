package ml.test.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour test jenkins");
		 
	}
	
	@Test
	public void additionTest(){
		assertTrue("Vrai",1+1==3);
	}
	
	@Test
	public void soustrationTest(){
		assertTrue("Vrai",1-1==0);
	}
	
	@Test
	public void multiplicationTest(){
		assertTrue("Vrai",2*2==4);
	}
}
