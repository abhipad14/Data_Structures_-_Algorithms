package Swapping_Nodes_At_Depth_K_In_Binary_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int node = scanf.nextInt();
		int[] a = new int[2*node+1];
		a[0]=1;
		int counter = 1;
		for(int i=0; i<node; i++){
			a[counter]=scanf.nextInt();
			a[++counter]=scanf.nextInt();
			counter++;
		}
		Node root = CreateTree(a, node);
		int T = scanf.nextInt();
		int[] test = new int[T];
		for(int i=0; i<T; i++){
			test[i] = scanf.nextInt();
		}
		for(int i=0; i<T; i++){
			Swap(root, test[i]);
			Inorder(root);
			System.out.println();
		}
	}

	
	public static Node CreateTree(int[] a, int n){
		Node root = new Node();
		root.data = 1;
		int counter = 1;
		Node[] node = new Node[n];
		node[0]= root;
		int position = 1;
		for(int i=0; i<n; i++){
			if(a[counter] == -1){
				node[counter/2].left=null;
			}
			else{
				Node dummy = new Node();
				dummy.data = a[counter];
				dummy.left = null;
				dummy.right = null;
				node[counter/2].left = dummy; 
				node[position++]=dummy;
			}
			if(a[++counter] == -1){
				node[(counter-1)/2].right = null;
			}
			else{
				Node dummy = new Node();
				dummy.data = a[counter];
				dummy.left = null;
				dummy.right = null;
				node[(counter-1)/2].right = dummy;
				node[position++] = dummy;
			}
			counter++;
		}
		
		
		
		return root;
	}


	public static void Inorder(Node root){
		if(root!=null){
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}

	
	public static void Swap(Node root, int k){
		HashMap<Integer, ArrayList<Node>> nodeList = new HashMap<>();
		nodeList = getNode(root, nodeList, 0, k);
		Set<Integer> key = nodeList.keySet();
		for(Integer i: key){
			ArrayList<Node> dummy = nodeList.get(i);
			for(Node dum: dummy){
				Node temp = dum.left;
				dum.left = dum.right;
				dum.right = temp;
			}
		}
		
	}
	
	
	public static HashMap<Integer, ArrayList<Node>> getNode(Node root, HashMap<Integer, ArrayList<Node>> map, int level, int k){
		level++;
		if(root!=null){
			if(level%k==0){
				if(map.containsKey(level)){
					map.get(level).add(root);
				}
				else{
					ArrayList<Node> dummy = new ArrayList<>();
					dummy.add(root);
					map.put(level, dummy);
				}
			}
			map = getNode(root.left, map, level, k);
			map = getNode(root.right, map, level, k);
			return map;
		}
		return map;
	}
}
