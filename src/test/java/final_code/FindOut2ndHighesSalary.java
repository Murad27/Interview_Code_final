package final_code;

import java.util.Arrays;

public class FindOut2ndHighesSalary {

	public static void main(String[] args) {
		int []num= {800,500,700,600,890}; //create array and pass some value
		int a=num.length; //array length is fixed call the veriable length (int -verable)
        Arrays.sort(num); //then call the sort method cz sort the number(veriable)
        int second=num[a-2];  //2nd veriable
        System.out.println(second);
           
	}

}
