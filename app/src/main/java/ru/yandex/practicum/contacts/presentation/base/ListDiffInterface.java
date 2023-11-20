package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    boolean theSameAs(T other);
    boolean contentSameAs(T other);
    @Override
    boolean equals(Object obj);
}
