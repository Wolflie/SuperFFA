package me.wolflie.superffa.store;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiPredicate;

public interface Store<K, V> {

    CompletableFuture<V> load(K key);

    CompletableFuture<V> save(V value);

    CompletableFuture<Map<K, V>> getStoreData();

    CompletableFuture<Map<K, V>> getDataMatchingPredicate(BiPredicate<K, V> predicate);

}
