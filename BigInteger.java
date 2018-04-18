import java.math.BigInteger;
public class BigInteger {
    public static void main (String[] a) {
      Integer n = integer.valueOf (a[0]);
      System.out.println(n);
        BigInteger factor=new BigInteger("1");
        for(Integer i=2;i<=n;i++){
          factor=factor.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factor);
    }
}
