import java.util.*;
class Stu{
	double bp;
	int ID;
	String name;
	int mno;
	String maid;
	String add;
Stu(int id,String na,int mno,String m,String a)
{
	ID=id;
	name=na;
	mno=mno;
	maid=m;
	add=a;
}
public static void netsal(double bp){
	double da,hra,pf,sf;
	double netsal;
	da=bp*97/100;
	hra=bp*10/100;
	pf=bp*12/100;
	sf=bp*0.1/100;
	netsal=bp+da+hra-(pf+sf);
	System.out.println(netsal);
	}
  }
class Pgm extends Stu{
	
	Pgm(int id,String na,int mno,String m,String a){
	super(id,na,mno,m,a);	
                  double bp=1600;
	netsal( bp);
	
	}}
class Assprof extends Stu{
	Assprof(int id,String na,int mno,String m,String a){
	super(id,na,mno,m,a);	
	double bp=8000;
	netsal( bp);
	
	}}
class Accprof extends Stu{
	Accprof(int id,String na,int mno,String m,String a){
	super(id,na,mno,m,a);	
	double bp=15000;
	netsal( bp);
	
	}}
class Prof extends Stu{
	Prof(int id,String na,int mno,String m,String a){
	super(id,na,mno,m,a);	
	double bp=20000;
	netsal( bp);
	
	}}
class Emp{ 
public static void main(String args[]){
	Pgm p=new Pgm(1,"logi",986,"logida@gmail.com","kalainagar");
	Assprof a=new Assprof(2,"kanu",984,"kanu@gmail.com","kanunagar");
	Accprof c=new Accprof(3,"banu",843,"banu@gmail.com","banunagar");
	Prof r=new Prof(4,"kar",372,"kar@gmail.com","karnagar");
	
}
}