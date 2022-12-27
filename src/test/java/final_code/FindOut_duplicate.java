package final_code;

public class FindOut_duplicate {

	public static void main(String[] args) {
	String []name= {"ab","bc","nc","bc"};
	for(int i=0;i<name.length;i++) {
		for(int j=i+1;j<name.length;j++) {
			if(name[i]==name[j]) {
			System.out.println("Find duplicate value " + name[i]);
		}
	}

	}}}


