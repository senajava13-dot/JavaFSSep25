package com.shristi.training;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Welcome to Java");

		int num[] = { 11, 73, 6, 20, 110, 3, 02, -37, 11, 3, 7, 6 };

		for (int i = 0; i < num.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < num.length; j++) {
                  if(num[j]<num[minIndex]){
                	  minIndex=j;
                  }
                  int minValue=num[minIndex];
                  num[minIndex]=num[i];
                  num[i]=minValue;
			}

		}

		for (int i : num) {
			System.out.println(i);
		}

	}
}
