import java.util.Arrays;
import java.util.HashMap;

import javax.swing.text.AttributeSet.ColorAttribute;

class FewestNoOfCoins{
    public static int fewestNumber(int coins[],int money){
        HashMap<Integer,Integer> map=new HashMap<>();
        int mon=money;
        for(int i=0;i<coins.length;i++){
            map.put(coins[i], 0);
            
        }
        for(int i=0;i<coins.length-1;i++){
            for(int j=0;j<coins.length-i-1;j++){
                if(coins[j]<coins[j+1]){
                    int temp=coins[j];
                    coins[j]=coins[j+1];
                    coins[j+1]=temp;
                }
            }
        }
        for(int i=0;i<coins.length;i++){
            int count=money/coins[i];
            map.put(coins[i],count);
            money%=coins[i];
            if(money==0)
                break;
        }
        map.put(coins[coins.length-1],map.get(coins[coins.length-1])+money);
        int sum=0;
        int check=0;
        for(int i=0;i<coins.length;i++){
            int val=map.get(coins[i]);
            sum+=val;
            check+=val*coins[i];
            if(check>mon)
                return -1;
        }
        return sum;  
    }
    public static void main(String[] args) {
        int coins[]={45,1};
        int money=1023;
        System.out.println(fewestNumber(coins,money));
        
    }
}