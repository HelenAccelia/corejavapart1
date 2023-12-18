package Assignment;
import java.util.*;
class UserDetails {
	String cardno;
    String pinno;
    String accno;
    String name; 
     int bal;
     int amt;
     String servicename;
    UserDetails(){
}
    UserDetails(String cardno, String pinno,String accno,String name,int bal){
    super();
     this.cardno=cardno;
        this.pinno=pinno;
        this.accno=accno;
        this.name=name;
        this.bal=bal;
    }
    UserDetails(int amt,String servicename){
        this.amt=amt;
        this.servicename=servicename;
    }
    public String toString(){
        return (amt+"-"+servicename);
    }
    class Process {
        Scanner sc=new Scanner(System.in);
    public static int c=0;
    ArrayList<UserDetails> list= new ArrayList<>();
    ArrayList<UserDetails> list1=new ArrayList<>();
    void add(){
    UserDetails u1=new UserDetails("73402320","1011","123456","abc",2000);
    UserDetails u2=new UserDetails("20489234","6070","987654","xyz",3000);
    UserDetails u3=new UserDetails("40839020","1213","101112","pqr",4000);
     list.add(u1) ;
     list.add(u2);
     list.add(u3);
    }
         String check(){
            int c1=0,cnt=0,cnt1=0,c2=0;
         StringBuilder s =new StringBuilder();
         String[] a=new String[4];
         String cnum=sc.next();
        String pnum="";  
            if(cnum.length()==8){
                for(UserDetails i:list){
                   
                    cnt++;
                    if(i.cardno.equals(cnum))
                    {
                        c2++;
                        break;
                    }
                }
                    if(c2==0){
                    System.out.println("Invalid cardno");
                    c1++;
                     
                    }
                
                 if(c1==0){
                   for(int j=0;j<4;j++){
                            a[j]=sc.next();
                            s.append(a[j]);
                        }
                   pnum=s.toString();
                 
                       
                     for(UserDetails i:list) {  
                         cnt1++;
                       if((i.pinno.equals(pnum))&&(cnt==cnt1)){
                           c++;
                           break;
                          
                       }
                     } if(c==0)
                           System.out.println("Invalid pin");
                    }
               
                
                    
                }
            
            else
             System.out.println("Inavliddd size");
             return pnum;
             
        }
        void withdraw(String pnum){
        
            for(UserDetails i: list){
                
                if(i.pinno.equals(pnum))
                {
                    System.out.println("enter amt");
                    int amt=sc.nextInt();
                    list1.add(new UserDetails(amt,"withdraw"));
                    i.bal=i.bal-amt;
                }
            } 
        }
        void transfer(String pnum){
                System.out.println("Enter Account Number: ");
                String anum=sc.next();
                System.out.println("Enter Name: ");
                String Name=sc.next();
                 System.out.println(" Enter a transfer amt:");
                 int amt=sc.nextInt();
                 for(UserDetails i: list){
                     if(i.pinno.equals(pnum))
                     {
                         i.bal=i.bal-amt;
                         list1.add(new UserDetails(amt,"Transfer"));
                     }
                     if((i.accno.equals(anum))&&(i.name.equals(Name)))
                           i.bal=i.bal+amt;
                 }
        }
                
                
        
        void checkbal(String pnum){
            for(UserDetails i:list){
                if(i.pinno.equals(pnum))
                System.out.println(i.bal);
            }
        }
        void deposit(String pnum){ 
            for(UserDetails i:list){
                if(i.pinno.equals(pnum))
                {
                     System.out.println("Enter amt: ");
                     int amt=sc.nextInt();
                     i.bal=i.bal+amt;
                     list1.add(new UserDetails(amt,"Deposit"));
                }
            }
        }
         
        void transactionhis(){
            for(UserDetails i:list1){
             System.out.println(i);
            }
        }
    }
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		Process p = new Process(); 
		   p.add();
		 String pnum = p.check();
//		Process p1=new Process();
		 int count=p.c;
		   if(count==1){
		    System.out.println("Select the service");
		  char ch;
		    do{
		        System.out.println("1-Withdraw");
		        System.out.println("2-Deposit");
		        System.out.println("3-CheckBalance");
		        System.out.println("4-Fund Transfer");
		        System.out.println("5-Transaction History");
		        int opt=sc.nextInt();
		        switch(opt){
		             case 1:
		                p.withdraw(pnum);
		                break;
		             case 2:
		                 p.deposit(pnum);
		                 break;
		            case 3:
		                 p.checkbal(pnum);
		                 break;
		             case 4:
		                 p.transfer(pnum);
		                 break;
		             case 5:
		                 p.transactionhis();
		                 break;
		                 default:
		                 System.out.println("enter a number 1 to 5");
		        }
		    
		        System.out.println("Do you want make another transaction ? y/n:");
		         ch=sc.next().charAt(0);
		    }
		         while(ch== 'Y' || ch=='y');
		//	System.out.println("Hello World");
		}
		}
	}

}
