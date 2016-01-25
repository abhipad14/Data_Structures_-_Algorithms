package MissingNumber;

public class FindMissing {

	public static void main(String[] args) {
		String number = new String("45689");
		int len = number.length();
		int count =  0;
		
		for(int i=0; i<len; i++){
			String no1 = number.substring(0, i+1);
			if(len <= (2*i+2)){
				String no2 = number.substring(i+1);
				count = i+1;
				break;
			}
			else{
				String no2 = number.substring(i+1, 2*i+2);
				int ino1 = Integer.parseInt(no1); 
				int ino2 = Integer.parseInt(no2);
				if(ino2 - ino1 <=2  && ino2 - ino1 > 0 ){
					String no3 = number.substring(2*i+2, 3*i+3);
					int ino3 = Integer.parseInt(no3);
					if(ino3 - ino2 <= 2  &&  ino3-ino2 >0){
						count = i+1;
						break;
					}
				}
			}
		}
		
		int s1 = 0;
		int e1 = s1+count;
		int s2 = e1;
		int e2 = s2+count;
		int n1=0,n2=0;
		while(e2<=len){
			if(e2 != len){
				
				 n1 = Integer.parseInt(number.substring(s1, e1));
				 n2 = Integer.parseInt(number.substring(s2, e2));
			}
			else{
				 n1 = Integer.parseInt(number.substring(s1, e1));
				 n2 = Integer.parseInt(number.substring(s2));
			}
			if(n2-n1 == 2){
				System.out.println("Missing Number:"+ (n1+1));
				break;
			}
			else{
				s1=e1;
				e1=s1+count;
				s2=e1;
				e2=s2+count;
			}
		}

	}

}
