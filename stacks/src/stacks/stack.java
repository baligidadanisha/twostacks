package stacks;
import java.util.*;
public class stack {
	 public static void main(String[] args) {
	        Scanner K=new Scanner(System.in);
	        LinkedList<Integer> l=new LinkedList<Integer>();
	        int q=K.nextInt();
	        for(int i=0;i<q;i++)
	        {
	            int type=K.nextInt();
	            if(type==1)
	            {
	            l.add(K.nextInt());
	            }
	            else if(type==2)
	            {
	                if(!l.isEmpty())
	                l.pollFirst();
	            }
	            else{
	                System.out.println(l.getFirst());
	            }
	        }
	    }
	}


