package Week1GEnericsPlusLambda.Quiz1.Q5;

// what is the following class converted to after type erasure?
public class Main {
    public static void main(String[] args) {

        // AFter type erasure the class will be converted to type Object. this is because
        // we do now yet know what type K or V will be but at the same time we are saying
        // this.key = (K) key and this.value = (V) value;


//        public class Pair<K, V> {
//
//            public Pair(K key, V value) {
//                this.key = key;
//                this.value = value;
//            }
//            public K getKey(); { return key; }
//            public V getValue(); { return value; }
//
//            public void setKey(K key)     { this.key = key; }
//            public void setValue(V value) { this.value = value; }
//
//            private K key;
//            private V value;
//        }


    }
}
