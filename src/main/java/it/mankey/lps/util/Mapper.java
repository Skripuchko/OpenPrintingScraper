package it.mankey.lps.util;

/**
 * @param <E> Collection element class
 * @param <T> Return type class
 * @since 07-09-2012 00:31
 */
public interface Mapper<E, T> {
    T map(E element);
}