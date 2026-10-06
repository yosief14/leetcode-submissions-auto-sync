class TimeMap {
    record Entry(String mood, int timestamp) {
    };

    private final HashMap<String, List<Entry>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new Entry(value, timestamp));

    }

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
