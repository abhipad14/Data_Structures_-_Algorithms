package Gray2Binary;

public class Convert {

	public static void main(String[] args) {
		String gray = "1001001000111110";
		StringBuffer binary = new StringBuffer();
		int counter = 0;
		for(int i=0; i<gray.length();i++){
			if(i==0)
				binary.append(gray.charAt(0));
			else{
				if(binary.charAt(counter) == '1'){
					if(gray.charAt(i)=='1')
						binary.append("0");
					if(gray.charAt(i)=='0')
						binary.append("1");
				}
				if(binary.charAt(counter)=='0'){
					if(gray.charAt(i)=='1')
						binary.append("1");
					if(gray.charAt(i)=='0')
						binary.append("0");
				}
				counter++;
			}
		}
		System.out.println(binary);
	}

}
