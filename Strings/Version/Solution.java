package Strings.Version;

public class Solution {
	public int compareVersion(String a, String b) {
		int answer  = 0;
		int index1=0, index2=0;
		int len1 = a.length();
		int len2 = b.length();
		while(index1<len1 && index2<len2){
			StringBuffer num1 = new StringBuffer();
			StringBuffer num2 = new StringBuffer();
			while(index1<len1){
				if(a.charAt(index1)>='0'  && a.charAt(index1)<='9'){
					num1.append(a.charAt(index1++));
				}
				else if(a.charAt(index1)=='.'){
					index1++;
					break;
				}
				else{
				    index1++;
				}
			}
			while(index2<len2){
				if(b.charAt(index2)>='0'  && b.charAt(index2)<='9'){
					num2.append(b.charAt(index2++));
				}
				else if(b.charAt(index2)=='.'){
					index2++;
					break;
				}
				else{
				    index2++;
				}
			}
			try{
				int one = Integer.parseInt(num1.toString());
				int two = Integer.parseInt(num2.toString());
				if(one>two){
					return 1;
				}
				else if(one<two){
					return -1;
				}
			}
			catch (Exception e){
				int templen1 = num1.length();
				int templen2 = num2.length();
				int tempindex = 0;
				if(templen1>templen2){
				    return 1;
				}
				else if(templen1<templen2){
				    return -1;
				}
				while(tempindex<templen1 && tempindex<templen2){
					if(num1.charAt(tempindex)>num2.charAt(tempindex)){
						return 1;
					}
					else if(num1.charAt(tempindex)<num2.charAt(tempindex)){
						return -1;
					}
					tempindex++;
				}
				if(tempindex<templen1){
					return -1;
				}
				else if(tempindex<templen2){
					return 1;
				}
			}
		}
		if(index1<len1){
			while(index1<len1 &&  a.charAt(index1)!='0'){
				answer = 1;
				index1++;
			}
		}
		else if(index2<len2){
			while(index2<len2 && b.charAt(index2)!='0'){
				answer = -1;
				index2++;
			}
		}
		return answer;
	}
}
