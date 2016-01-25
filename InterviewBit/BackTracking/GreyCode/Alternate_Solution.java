package BackTracking.GreyCode;

import java.util.ArrayList;

public class ShortSolution {
	public ArrayList<Integer> grayCode(int a) {
		ArrayList<Integer> answer = new ArrayList<>();
		ArrayList<String> gray = new ArrayList<>();
		gray = getGray(a, gray, a);
		for(String s: gray){
			answer.add(toDecimal(s));
		}
		return answer;
	}
	
	public int toDecimal(String binary){
		int len = binary.length();
		int deci = 0;
		for(int i=len-1; i>=0; i--){
			if(binary.charAt(i)=='1'){
				deci = deci + (int)Math.pow(2, len-i-1);
			}
		}
		return deci;
	}
	
	public ArrayList<String> getGray(int val, ArrayList<String> gray, int a){
		if(val>0){
			StringBuilder zero = new StringBuilder();
			StringBuilder one = new StringBuilder();
			for(int i=1; i<a-val; i++){
				zero.append('0');
				one.append('0');
			}
			zero.append('0');
			one.append('1');
			ArrayList<String> temp = new ArrayList<>();
			if(gray.size()==0){
				temp.add(zero.toString());
				temp.add(one.toString());
			}
			for(int i=0; i<gray.size(); i++){
				StringBuilder tzero = new StringBuilder();
				tzero.append(zero);
				tzero.append(gray.get(i));
				temp.add(tzero.toString());
			}
			for(int i=gray.size()-1; i>=0; i--){
				StringBuilder tone = new StringBuilder();
				tone.append(one);
				tone.append(gray.get(i));
				temp.add(tone.toString());
			}
			
			gray =  getGray(--val, temp, a);
			return gray;
		}
		else{
			return gray;
		}
	}
}
