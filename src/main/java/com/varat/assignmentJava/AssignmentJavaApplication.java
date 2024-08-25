package com.varat.assignmentJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentJavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(AssignmentJavaApplication.class, args);


		// Q1
		System.out.println("Question 1");
		int[] Q1Ex1 = {7,1,5,3,6,4};
		System.out.println(Q1(Q1Ex1));
		int[] Q1Ex2 = {7,6,4,3,1};
		System.out.println(Q1(Q1Ex2));
		System.out.println("");
		//

		// Q2
		System.out.println("Question 2");
		String v1Q2Ex1 = "1.01";
		String v2Q2Ex1 = "1.001";
		System.out.println(Q2(v1Q2Ex1,v2Q2Ex1));
		String v1Q2Ex2 = "1.0";
		String v2Q2Ex2 = "1.0.0";
		System.out.println(Q2(v1Q2Ex2,v2Q2Ex2));
		String v1Q2Ex3 = "0.1";
		String v2Q2Ex3 = "1.1";
		System.out.println(Q2(v1Q2Ex3,v2Q2Ex3));
		System.out.println("");
		//

		//Q3
		System.out.println("Question 3");
		int Q3Ex1 = 2;
		System.out.println(Q3(Q3Ex1));
		int Q3Ex2 = 3;
		System.out.println(Q3(Q3Ex2));
		System.out.println("");
	}

	public static int Q1(int[] in){
		int max = 0;
		int left = 0;
		int right = 0;

		while( right < in.length ){

			if(in[left]<in[right]){
				int result = in[right]-in[left];
				max = Math.max(max,result);
			}
			else{
				left = right;
			}
			right++;
		}

		return max;
	}

	public static int Q2(String version1,String version2){

		String[] v1Lists = version1.split("\\.");
		String[] v2Lists = version2.split("\\.");

		int left = 0;
		int right = 0;
		int result = 0;

		while(left < v1Lists.length || right < v2Lists.length){

			if(left >= v1Lists.length ){
				result =  Integer.parseInt(v2Lists[right]) > 0 ? -1 : result;
				right++;
				continue;
			}
			else if(right >= v2Lists.length ){
				result =  Integer.parseInt(v1Lists[left]) > 0 ? 1 : result;
				left++;
				continue;
			}

			if (Integer.parseInt(v1Lists[left]) > Integer.parseInt(v2Lists[right]) ){
				result = 1;
			}
			else if(Integer.parseInt(v1Lists[left]) < Integer.parseInt(v2Lists[right]) ){
				result = -1;
			}

			if(result != 0){
				break;
			}
			left++;
			right++;
		}

		return result;
	}

	public static int Q3(int n){

		int one = 1;
		int two = 1;

		for(int i = 0 ; i < n-1 ;i++){

			int temp = one;
			one = one + two;
			two = temp;
		}

		return one;
	}
}
