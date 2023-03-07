package net.upliftinglemma.demo

import org.gradle.api.provider.Provider
import java.util.function.Predicate

// The signature of Provider.map in Java is:
//
//     <S> Provider<S> map(Transformer<? extends @org.jetbrains.annotations.Nullable S, ? super T> transformer);
//
// which (presumably) should permit a nullable return type from this lambda.

fun <T> Provider<T>.filter(predicate: Predicate<T>): Provider<T> =
    map { if (predicate.test(it)) it else null }
