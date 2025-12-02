package com.intheeast.ioc.beanoverview.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public final class ServiceLocator {

    private static final ServiceLocator INSTANCE = new ServiceLocator();

    private final Map<Class<?>, Supplier<?>> factories = new ConcurrentHashMap<>();

    // 캐시 용도
    private final Map<Class<?>, Object> services = new ConcurrentHashMap<>();

    private ServiceLocator() {}

    public static ServiceLocator getInstance() {
        return INSTANCE;
    }

    public <T> void registerFactory(Class<T> type, Supplier<? extends T> factory) {
        factories.put(type, factory);
    }

    public <T> void registerInstance(Class<T> type, T instance) {
        services.put(type, instance);
    }

    @SuppressWarnings("unchecked")
    public <T> T getService(Class<T> type) {
        // 캐시 먼저 확인
        Object svc = services.get(type);
        if (svc != null) return (T) svc;

        // 팩토리 사용
        Supplier<?> factory = factories.get(type);
        if (factory != null) {
            T created = (T) factory.get();
            Object existing = services.putIfAbsent(type, created);
            return existing == null ? created : (T) existing;
        }

        throw new IllegalStateException("No service registered: " + type);
    }
}