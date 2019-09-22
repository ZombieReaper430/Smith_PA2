import java.util.Scanner;

public class Smith_p3 {

	public static void main(String[] args) 
	{
		   
	       String[] topic={"Movies","Video Games","YouTube","Exercising","Reading"};
	       int[][] responses = new int[5][11];
	       
	       for(int i=0; i<4; i++)
	       {
	           for(int j=1;j<=10;j++){
	               responses[i][j] = 0;
	           }
	       }
	       
	       int peoples;
	       
	       System.out.print("Please enter number of voters:");
	       Scanner scan=new Scanner(System.in);
	       peoples=scan.nextInt();
	       
	       int i=1;
	       
	       //responses
	       while(i<=peoples)
	       {
	           for(int j=0;j<5;j++)
	           { 
	        		   System.out.print("Voter Number "+i+": "+topic[j]+" :");
	        		   int x = scan.nextInt();
	        		   responses[j][x]=responses[j][x]+1;
	           }
	           i++;
	       }

	       int maxTotal=0,minTotal=10000;
	       int maxTopic=0,minTopic=0;
	       
	       System.out.println();
	       System.out.println("Topic "+"Total  "+"Average ");
	       
	       for(i=0;i<5;i++)
	       {
	           int total=0,count=0;
	           for(int j=1;j<=10;j++)
	           {
	               total=total+j*responses[i][j]; 
	               count=count+responses[i][j];
	           }
	           if(maxTotal<total)
	           {  
	               maxTotal=total;
	               maxTopic=i;
	           }
	           if(minTotal>total)
	           {  
	               minTotal=total;
	               minTopic=i;
	           }
	           System.out.println(topic[i]+" "+total+" "+(total * 1.0) / count);
	       }
	       
	       System.out.println();
	       System.out.println("Maximum Topic");
	       System.out.println(topic[maxTopic]+" "+maxTotal);
	       
	       System.out.println();
	       System.out.println("Minimum Topic");
	       System.out.println(topic[minTopic]+" "+minTotal);
	       
	   }
}
