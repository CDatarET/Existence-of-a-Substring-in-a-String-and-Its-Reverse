class Solution {    
    public boolean isSubstringPresent(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length() - 1; i++){
            map.put(s.substring(i, i + 2), 1);
        }

        String rev = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < rev.length() - 1; i++){
            if(map.get(rev.substring(i, i + 2)) != null){
                return true;
            }
        }

        return false;
    }
}
