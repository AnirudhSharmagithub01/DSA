class Recursion{
  // factorial function
  public int factorial(int n){
    if(n == 0){
      return 1;
    }
    return n * factorial(n-1);
  }

  // this function calculate the sum of digit in n;
  public int sumofdigits(int n){
    
    if(n == 0  || n<0){
      return 0;
    }
    return n % 10 + sumofdigits(n/10);
  }

  // this function give the power of the given input
  public int power(int x,int n){
    if(n == 0){
      return 1;
    }
    if(n == 1){
      return x;
    }
    return x * power(x,n-1);
  }

  // this function give the greatest common divisor
  public int GCD(int a,int b){
    if(b == 0){
      return a;
    }
    return GCD(b,a%b);
  }

  // this function Decimal to binary
  public int Decimal_to_Binary(int n){
    if(n == 0){
      return 0;
    }
    return n % 2 + 10 * Decimal_to_Binary(n/2);
  }


  // this function is Binary to Decimal
  public int BinarytoDecimal(int n){
    if(n == 0){
      return 0;
    }
   
    return  n % 10 + 2 * BinarytoDecimal(n/10);
  }

}