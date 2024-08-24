package com.varat.assignmentJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentJavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(AssignmentJavaApplication.class, args);


		// Q1
		int[] Q1Ex1 = {7,1,5,3,6,4};
		int[] Q1Ex2 = {7,6,4,3,1};
		System.out.println(Q1(Q1Ex1));
		System.out.println(Q1(Q1Ex2));

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

	
}
