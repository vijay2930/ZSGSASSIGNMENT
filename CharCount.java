import java.util.HashMap;
class CharCount {
    public static void count(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i), 0);
        }
        for(int i=0;i<s2.length();i++){
            Character c1=s2.charAt(i);
            for(int j=0;j<s1.length();j++){
                Character c2=s1.charAt(j);
                if(c1==c2){
                    String val=map.get(c2).toString();
                    if(val!=null){
                        map.put(c1, Integer.parseInt(val)+1);
                    }
                }
            }
        }
        for(int i=0;i<s2.length();i++){
            System.out.println(s2.charAt(i)+":"+map.get(s2.charAt(i)));
        }
    }
    public static void main(String[] args) {
        String s1="Hello World Please";
        String s2="Help";
        count(s1,s2);
    }
}
