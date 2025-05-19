package com.intheeast.ioc.annotationbasedcontainerconfiguration.usinggenerics.domain;

public interface Store<T> {
    void addItem(T item);

    T getItem(int index);

    String storeType();
}
