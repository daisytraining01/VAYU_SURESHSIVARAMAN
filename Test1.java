package Project;

import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		        char arr[] = {1,2,3,4,5};
		        LinkedList<Integer> fifo = new LinkedList<Integer>();

		        for (int i = 0; i < arr.length; i++)
		            fifo.add (new Integer (arr[i]));

		        System.out.print (fifo.removeFirst());
		        while (! fifo.isEmpty())
		            System.out.print (fifo.removeFirst());
		        System.out.println();
		    }
		
}


/* Output
12345
*/