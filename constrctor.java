 class constrctor {
   private int l;  int b; int h;
    constrctor(){
        l=1;
        b=2;
        h=3;
    }
    constrctor(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    public static void main(String[]args){
        constrctor c1= new constrctor();
        constrctor c2= new constrctor(7,8,9);
        System.out.println("lenght"+c1.l);
        System.out.println("lenght"+c2.l);
    }
    
}