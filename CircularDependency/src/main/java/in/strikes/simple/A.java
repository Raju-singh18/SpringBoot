package in.strikes.simple;

public class A {
   private B b;
//
//   public A(B b){
//       this.b=b;
//   }

    public A(){
        System.out.println("A created");
        this.b=new B();

    }

}
