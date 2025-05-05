class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        char Char[]=s.toCharArray();

        int i,j;
        int result=0;
        for(i=0,j=1;j<Char.length;i++,j++)
        {
            if(hm.get(Char[i])<hm.get(Char[j]))
            {
                result-=hm.get(Char[i]);
            }
            else
            {
                result+=hm.get(Char[i]);
            }
        }
        result+=hm.get(Char[i]);
        return result;

       
    }
}