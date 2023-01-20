
public class FindSuperString {
    public static int findString(String x[],String y[]){
        int count=0;
        for(int i=0;i<x.length;i++){
            int tempCount=0;
            for(int j=0;j<y.length;j++){
                char c1[]=x[i].toCharArray();
                char c2[]=y[j].toCharArray();
                sort(c1);
                sort(c2);
                int m,k;
                for(k=0,m=0;k<c1.length && m<c2.length;){
                        if(c1[k]==c2[m]){
                            k++;
                            m++;
                        }else{
                            k++;
                        }
                }
                if(m==c2.length){
                    tempCount++;
                }
            }
            if(tempCount==y.length){
                count++;
            }
        }
        return count;
    }
    public static void sort(char c[]){
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length-1-i;j++){
                if(c[j]>c[j+1]){
                    char temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String x[]={"ceo","alco","caaeio","ceai"};
        String Y[]={"ec","oc","ceo"};
        System.out.println(findString(x, Y));
        
    }
}
