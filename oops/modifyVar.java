package bridgeLabz.oops;
class modifyVar{
int num;
String alpha;

static String colorname="hello";

modifyVar(int num, String alpha){
    this.num=num;
    this.alpha=alpha;
}

void display(){
    System.out.println("number: "+num+" , alphabet: "+alpha+" , name : "+colorname);

}

public static void main(String[] args){
 
    modifyVar v1=new modifyVar(23,"w");
    modifyVar v2=new modifyVar(1,"a");
    System.out.println("before");
    v1.display();
    v2.display();

    v1.colorname="yellow";
    System.out.println("after");
    v1.display();
    v2.display();





 }
}


