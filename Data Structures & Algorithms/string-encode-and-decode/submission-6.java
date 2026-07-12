class Solution {
             String res = "";
    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
            List<Integer> size = new ArrayList<>();
           StringBuilder sb = new StringBuilder();
           for(String str : strs){
            size.add(str.length());
           } 
           for(int num : size){
            sb.append(num).append(',');
           }
           sb.append('#');
           for(String str : strs){
            sb.append(str);
           }
           return sb.toString();
    }   
    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i=0;
        while(str.charAt(i) != '#'){
            StringBuilder curr = new StringBuilder();
            while(str.charAt(i) != ','){
               curr.append(str.charAt(i));
               i++; 
            }
                sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }
        i++;
        for(int size : sizes){
           res.add(str.substring(i,i+size));
           i = i + size;
        }
        return res;
    }
}
