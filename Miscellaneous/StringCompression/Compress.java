package StringCompression;

public class Compress {

	public static void main(String[] args) {
		String input = "aabcccccaaa";	
		StringBuffer finalString = new StringBuffer();
		String value = "A";
		int counter = 1;
		
		for(int i = 0; i<input.length(); i++){
			if (i == 0){
				value = Character.toString(input.charAt(i));
			}
			else{
				if(Character.toString(input.charAt(i)).equals(value)){
					counter++;
				}
				else{
					finalString.append(value);
					finalString.append(Integer.toString(counter));
					counter = 1;
					value = Character.toString(input.charAt(i));
				}
			}
			if(i == input.length()-1){
				finalString.append(value);
				finalString.append(Integer.toString(counter));
			}
		
		}
		
		if(input.length() > finalString.length())
			System.out.println(finalString);
		else
			System.out.println(input);

	}

}
