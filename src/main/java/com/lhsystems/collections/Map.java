package com.lhsystems.collections;

public interface Map<K,V> {

	public void put(K key, V val);
	
	public V get(K key);
	
	public Set<K> keySet();
	
	public List<V> values();
	
}
