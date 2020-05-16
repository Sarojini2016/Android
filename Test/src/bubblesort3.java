
public class bubblesort3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,29,67,90,78};
		int temp ;
		for(int i=0;i<a.length;i++) {
			for(int k=0;k<a.length-1;k++) {
				if(a[k]>a[k+1])
				{
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
			
		}
		for (int m = 0; m< a.length; m++) {
			System.out.print("" +  a[m]+"");
			
		}
	}

}
