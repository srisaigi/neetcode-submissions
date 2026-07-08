class TimeMap {

    HashMap<String, TreeMap<Integer, String>> mp;

    public TimeMap() {
        mp = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        mp.putIfAbsent(key, new TreeMap<>());
        mp.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!mp.containsKey(key)) {
            return "";
        }

        Integer t = mp.get(key).floorKey(timestamp);

        if (t == null) {
            return "";
        }

        return mp.get(key).get(t);
    }
}