import java.math.BigInteger;

public class bignumbers {
    private BigInteger a ;
    private BigInteger b ;
   private BigInteger sumarg;

//    public bignumbers(String valueOf) {
//    }


    public  bignumbers(BigInteger a1, BigInteger b1) {
        this.a = a1;
        this.b = b1;

        BigInteger sum = a.add(b);
       sumarg = sum.divide(BigInteger.valueOf(2));

//        return sumarg;

    }

   
    public bignumbers(BigInteger sumarg) {
        this.sumarg = sumarg;
    }

//    public bignumbers(String s, String s1) {
//    }


    public BigInteger getA() {
        return a;
    }

    public BigInteger getB() {
        return b;
    }

    public BigInteger getSumarg() {
        return sumarg;
    }
}
