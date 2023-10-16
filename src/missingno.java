
public class missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,6,7};
		int sum1=0;
		int sum2=0;
		for(int i=0;i< a1.length;i++)
		{
			sum1=sum1+a1[i];
			
		}
		System.out.println(sum1);
		for (int j=0;j<=7;j++)
		{
			sum2=sum2+j;
		}
		System.out.println(sum2);
		int missingno=sum2-sum1;
		System.out.println(missingno);
	}

}
