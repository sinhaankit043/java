class staticMember{
    int x;                            // instance member variable
    static int y;                     // static member variable
    public void fun1(){
        y=3;
        x=18;
    };                            // instance member function
    public static void fun2(){
        // x=9;       ->cannot assign value to instance variable from static function
        y=14;
    };      // static member function

    public static void main(String[]args){
       staticMember e1= new staticMember();
       staticMember e2= new staticMember();
       e1.x=5;
       e2.x=7;
       staticMember.y=10;
       System.out.println("value of x for e1:"+e1.x);    //5
       System.out.println("value of x for e2:"+e2.x);    // 7
       System.out.println("value of y:"+staticMember.y); //10 
       staticMember.fun2();
       System.out.println("value of y after func2:"+staticMember.y); //14
       e1.fun1();
       System.out.println("value of y after func1:"+staticMember.y+ ",value of x after fun1 "+e1.x+ ",value of x after fun1 "+e2.x);
       // 3,18,7
    }
}
