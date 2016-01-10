package Citrix_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

import Citrix_Test.OpGearCost.RadCos;

public class OpGearCost {

	public static void main(String[] args) {
		int n = 5;
		int dis = 8;
		int[] rad = {1,3,6,2,5};
		int[] cost = {5,6,8,3,4};
		
		int[] table = Cirles(dis, rad, cost);
		for(int i=0; i<n; i++){
			System.out.println(table[i]);
		}

	}
	
	
	public static int[] Cirles(int distance, int[] radius, int[] cost) {
		int len = radius.length, counter = 0, cost1=0, index = -1, radius1 = 0;
		int[] table = new int[len];
		
		ArrayList<RadCos> list = new ArrayList<>();
		for(int i=0; i<len; i++){
			OpGearCost dum = new OpGearCost();
			RadCos dummy = dum.new RadCos();
			dummy.setCost(cost[i]);
			dummy.setIndex(i);
			dummy.setRadius(radius[i]);
			list.add(dummy);
		}
		Collections.sort(list);
		
		for(int i=0; i< len; i++){
			int rad1 = list.get(i).getRadius();
			counter=0;
			index=-1;
			for(int j=len-1; j>=0; j--){
				int rad2 = list.get(j).getRadius();
				
				if(rad1+rad2 >= distance){
					
					if(counter == 0){
						cost1 = list.get(j).getCost();
						index = list.get(j).getIndex();
						radius1 = rad2;
						counter++;
					}
					if(list.get(j).getCost() < cost1){
						cost1 = list.get(j).getCost();
						index = list.get(j).getIndex();
						radius1 = rad2;
					}
					if(list.get(j).getCost() == cost1){
						if(rad2 > radius1){
							cost1 = list.get(j).getCost();
							index = list.get(j).getIndex();
							radius1 = rad2;
						}
						else if(rad2 == radius1){
							if(list.get(j).getIndex() < index){
								cost1 = list.get(j).getCost();
								index = list.get(j).getIndex();
								radius1 = rad2;
							}
						}
					}
				}
				else{
					break;
				}
			}
			if(index != -1){
				table[list.get(i).getIndex()] = index+1;
			}
		}
		
		
		
		return table;
	}

	
	
	public class RadCos implements Comparable<RadCos>{
		private int radius;
		private int cost;
		private int index;
		
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getRadius() {
			return radius;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
	
		@Override
		public int compareTo(RadCos o) {
			if(radius - o.getRadius() > 0)
				return 1;
			if(radius - o.getRadius() < 0)
				return -1;
			
			return 0;
		}
		
	}
}
