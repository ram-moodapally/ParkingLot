package Util;

public class Pair<K,V> {
    K k;
    V v;
    public Pair(K k, V v){
        this.k = k;
        this.v = v;
    }

    public K getK(){
        return k;
    }
    public V getV() {
        return v;
    }
    @Override
    public String toString(){
        return "Pari { "+
                " k = " +k +
                " v = "+ v+
                "} ";
    }
}
