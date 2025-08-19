package bridgeLabz.oops;
class demo{
    int var1;
    demo(int var1){
        this.var1=var1;
    }

    void xyz(){
        int var1=90;
        System.out.println(var1);
        System.out.println(this.var1);
    }

    public static void main(String[] args){
        demo obj=new demo(100);
        obj.xyz();
    }
}
