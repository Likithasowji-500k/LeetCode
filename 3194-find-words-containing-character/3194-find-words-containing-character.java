class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr=new ArrayList<>();
        int k=0;
        for(int i=0;i<words.length;i++){
           
            for(int j=0;j<words[i].length();j++){
                  if(words[i].charAt(j)==x){
                    arr.add(i);
                    break;
                  }
            }
            
        }
        
        return arr;
    }
}