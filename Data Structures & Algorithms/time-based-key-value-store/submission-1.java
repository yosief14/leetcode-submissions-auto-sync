class TimeMap {
    record Entry(String mood, int timestamp) {
    };

    private final HashMap<String, List<Entry>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    // Store key val pair at the given timestamp
    public void set(String key, String value, int timestamp) {

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Entry(value, timestamp));

    }

    // Return value pointed to by key where the stored time stamp is less than
    // timestamp given
    // if there are multiple values with earlier time stamps return largest time
    // stamp that is less than given `timestamp`
    // if no vals return ""
    public String get(String key, int timestamp) {
        List<Entry> list = map.get(key); 
        if(list == null){
            return "";
        }
        
        int min = -1;

        int l = 0 , r = map.get(key).size() -1, m = 0;

        while (l<= r){
            m = (l+r)/2;
            int mid = map.get(key).get(m).timestamp;
            if(mid <= timestamp){
                min = Math.max(m,min);
                l = m + 1;
            } else{
                r = m-1;
            }
        }
        return min == -1 ? "" : list.get(min).mood;
    }
}

/*
Can store multiple values for the same key at diff time stamps, and retrieve key's val at certain timestamp


*/
