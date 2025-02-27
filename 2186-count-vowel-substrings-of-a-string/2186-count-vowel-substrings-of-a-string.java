class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        String vowels = "aeiou";
        for(int i=0; i<word.length()-4; i++){
            Set<Character> set = new HashSet();
            for (int j=i; j<word.length(); j++ ){
                char c = word.charAt(j);
                if (vowels.indexOf(c) > -1){
                    set.add(c);
                    
                    if(set.size() == 5){
                    count++;
                    
                    }
                }
                else{
                    break;
                }
                
            }
        }
        return count;

    }
}
