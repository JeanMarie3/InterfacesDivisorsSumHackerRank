import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {

        int sum1 = 0;
        for( int i=1; i<=n; i++){

            if(n % i == 0){

                sum1 = sum1 + i;

            }
        }
        return sum1;
    }
}
