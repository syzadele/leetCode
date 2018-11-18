class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> times = new HashMap<String, Integer>();
        List<String> result = new ArrayList<String>();
        
        for (String website : cpdomains) {
            String[] split = website.split(" ");
            int visit = Integer.valueOf(split[0]);
            times.put(split[1], times.getOrDefault(split[1], 0) + visit);
            
            char[] websiteArray = split[1].toCharArray();
            for (int i = 0; i < websiteArray.length; i++) {
                if (websiteArray[i] == '.') {
                    String key = split[1].substring(i + 1, websiteArray.length);
                    times.put(key, times.getOrDefault(key, 0) + visit);
                }
            }  
        }
        
        for (Map.Entry<String, Integer> entry : times.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        
        return result;
    }
}
