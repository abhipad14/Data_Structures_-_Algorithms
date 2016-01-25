package Strings.Ipaddress;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Solution ans = new Solution();
		String a = scanf.nextLine();
		ArrayList<String> ips = new ArrayList<>();
		ips = ans.restoreIpAddresses(a);
		for(String ip: ips){
			System.out.println(ip);
		}

	}

}
