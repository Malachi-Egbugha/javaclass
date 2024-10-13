    class Hello{
public static void main(String[] args)  {
    //variable are stores for storing values
    /* 
    int firstvariable = 7,secondvariabel = 9;
    int addition = firstvariable + secondvariabel;
    */
    /* 
    byte a = 120;
    boolean b = true;
    double d = 1.234;
    float f = 1.56f;
    long l = 23l;
    //type casting
    int dd = 1;
    double ii = dd;
    */


    //byte 1 byte
    // 8 bit
  //arithmetic operators
  //1. addition +
  int addone =1;
  int addtwo = 2;
  int adds = (int)addone + (int)addtwo; //3
  //subtraction
  int subt = addtwo - addone;
  // *
  // /
  // %
  //increment ++
  int z =1;
  //++z; // pre increment
  //z++; // post increment
  //int y = z;
  //z = z + 1;
  //int y = ++z;

//
  //decrement
  //z--;
  //asigment operators
int x ;
x = 2;
x = x - 4;
x -=4;
int u = 10;
  //comparison operators
  boolean d = x > u;
  double a =10 % 7; //3
   /// and or 
   ///and   & &&
   /// //result is true when all the expressions are true
   /// or | ||
   int f = 13;
   int  j = 15;
   boolean answer = f > j  && j > f;
   boolean test = false || (6 % 4 == 2 && true);
   if(false || (6 % 4 == 2 && false))
   {
   
    System.out.println("i was executed");
   }
   else if(5 < 9){
    System.out.println("else was executed");

   }
   else if(6 <=9){

   }
   else{
    

   }
   // or | || // short circuiting
   // for or operation the result is true if any of the expression is true
   System.out.println(test);
   
    
}    

}