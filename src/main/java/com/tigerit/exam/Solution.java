package com.tigerit.exam;


import static com.tigerit.exam.IO.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * All of your application logic should be placed inside this class.
 * Remember we will load your application from our custom container.
 * You may add private method inside this class but, make sure your
 * application's execution points start from inside run method.
 */
public class Solution implements Runnable {
    @Override
    public void run() {
        // your application entry point
		

        // sample input process
        
    	int t_c=1;
    	
    	
        // your application entry point

        // sample input process
    	Integer t=readLineAsInteger();
    	String t_name[]=new String[20];
    	Integer data[][][]=new Integer[15][110][110];
    	Integer c[]=new Integer[15];
    	Integer r[]=new Integer[15];
    	String cn[][]=new String[15][110];
    	String rn[][]=new String[15][110];
    	while(t!=0)
    	{
    		Integer tn=readLineAsInteger();
    		for(Integer i=0;i<tn;i++)
    		{
    			//System.out.println("In for"+i);
    			String temp[]=new String[110];
    			t_name[i]=readLine();
    			temp=readLine().split(" ");
    			c[i]=Integer.parseInt(temp[0]);
    			r[i]=Integer.parseInt(temp[1]);
    			cn[i]=readLine().split(" ");
    			//System.out.print("Nazim  "+cn[0][0]);
    			//System.out.println(t_name[i]+" "+r[i]+" "+c[i]);
    			
    			for(Integer ri=0;ri<r[i];ri++)
    			{
    				temp=readLine().split(" ");
    				for(Integer ci=0;ci<c[i];ci++)
    				{
    					data[i][ri][ci]=Integer.parseInt(temp[ci]);
    				}
    			}
    			/*for(Integer ri=0;ri<r[i];ri++)
    			{
    				//System.out.println(r[i]);
    				
    				for(Integer ci=0;ci<c[i];ci++)
    				{
    					System.out.print(data[i][ri][ci]+" ");
    				}
    				System.out.print("\n");
    			}*/
    			
    		}
    		Integer q=readLineAsInteger();
    		while(q!=0)
    		{
    			//System.out.println("IN bla");
    			//System.out.println(q);
    			q--;
    			String q1,q2,q3,q4;
    			if(t_c>1)
    				q1=readLine();
        		q1=readLine();
        		//System.out.println(q1);
        		q2=readLine();
        		//System.out.println(q2);
        		q3=readLine();
        	//	System.out.println(q3);
        		q4=readLine();
        	//	System.out.println(q4);
        		String temp[];
        	//	System.out.println(q1+" "+q2+" "+q3+" "+q4);
        		temp=q2.split(" ");
        		Integer Ta=0,Tb=1;
        		String Ta_name,Tb_name;
        		for(Integer i=0;i<tn;i++)
        		{
        			//System.out.println("Table name swap: "+temp[1]+""+temp[2]+""+t_name[i]+"nazim"+temp[1].equals(t_name[i]));
        			if(t_name[i].equals(temp[1]))
        			{
        			//	System.out.println("Yes");
        				if(temp.length==3)
        					t_name[i]=temp[2];
        				Ta=i;
        				Ta_name=t_name[i];
        				break;
        			}
        		}
        		temp=q3.split(" ");
        		for(Integer i=0;i<tn;i++)
        		{
        			if(t_name[i].equals(temp[1]))
        			{
        				if(temp.length==3)
        					t_name[i]=temp[2];
        				Tb=i;
        				Tb_name=t_name[i];
        				break;
        			}
        		}
        		Integer count=0;
        		Integer T_N[]=new Integer[210],C_N[]=new Integer[210];
        		temp=q1.split(" ");
        		if(temp[1].equals("*"))
        		{
        			for(int nn=0;nn<cn[Ta].length;nn++)
        			{
        				
        				T_N[count]=Ta;
        				C_N[count]=nn;
        				count++;
        			}
        			for(int nn=0;nn<cn[Tb].length;nn++)
        			{
        				
        				T_N[count]=Tb;
        				C_N[count]=nn;
        				count++;
        			}
        			
        		}
        		else
        		for(Integer i=1;i<temp.length;i++)
        		{
        			temp[i]=temp[i].replace(",","");
        			
        		    String[] temp1=temp[i].split("\\.");	
        		    for(Integer j=0;j<tn;j++)
        		    {
        		    	//System.out.println("Temp1 "+temp1[0]+" "+t_name[j]);
        		    	if(temp1[0].equals(t_name[j]))
        		    	{
        		    	//	System.out.println("q1 "+temp[i]);
        		    		T_N[i-1]=j;
        		    		count++;
        		    	}
        		    }
        		    for(Integer j=0;j<cn[T_N[i-1]].length;j++)
        		    {
        		    	//System.out.println(i+" "+j+" "+cn[T_N[i-1]][j]+" "+temp1[1]);
        		    	if(cn[T_N[i-1]][j].equals(temp1[1]))
        		    	{
        		    		C_N[i-1]=j;
        		    	}
        		    }
        		}
        		Integer sac=0,sbc=0;
        		temp=q4.split(" ");
        		String temp1[]=temp[1].split("\\.");
        		Integer sta,stb;
        		//System.out.println(q4+" "+temp1[0]+T_N[0]+" Ta "+Ta+" Tb "+Tb);
        		if(temp1[0].equals(t_name[Ta]))
        		{
        			sta=Ta;
        			stb=Tb;
        		}
        		else
        		{
        			sta=Tb;
        			stb=Ta;
        		}
        		for(Integer i=0;i<c[sta];i++)
        		{
        			if(temp1[1].equals(cn[sta][i]))
        			{
        				//System.out.println("Nazim    Nazim");
        				sac=i;
        				break;
        			}
        		}
        		temp1=temp[3].split("\\.");
        		//System.out.println("bal "+temp1[1]+" "+sta+" "+stb);
        		for(Integer i=0;i<c[stb];i++)
        		{
        			if(temp1[1].equals(cn[stb][i]))
        			{
        				sbc=i;
        			}
        		}
        		System.out.println("Test: "+t_c++);
        		for(int i=0;i<count-1;i++)
        		{
        			System.out.print(cn[T_N[i]][C_N[i]]+" ");
        		}
        		System.out.println(cn[T_N[count-1]][C_N[count-1]]);
        		//System.out.println("ca cb \n"+sac+" "+sbc);
        		for(Integer i=0;i<r[Ta];i++)
        		{
        			
        			Integer m=-1;
        			for(Integer j=0;j<r[Tb];j++)
        			{
        				if(data[Ta][i][sac]==data[Tb][j][sbc])
        				{
        					m=j;
        					break;
        				}
        				
        			}
        			//System.out.println(data[Ta][i][sac]+" "+data[Tb][m][sbc]);
        			if(m!=-1)
        			for(int j=0;j<count;j++)
        			{
        				if(T_N[j]==sta)
        				{
        					System.out.print(data[T_N[j]][i][C_N[j]]);
        				}
        				else
        				{
        					if(m==-1)
        						System.out.print("0 ");
        					else
        						System.out.print(data[T_N[j]][m][C_N[j]]);
        						
        				}
        				if(j<count-1)
        					System.out.print(" ");
        				
        				
        			}
        			if(m!=-1)
        			System.out.println("");
        			
        		}
        //		System.out.println(q+"End");
        		
        		

    		}
    		t--;
    		
    	}
    }
}
