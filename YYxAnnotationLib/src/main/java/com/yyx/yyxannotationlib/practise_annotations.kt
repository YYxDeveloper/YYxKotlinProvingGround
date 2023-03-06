package com.yyx.yyxannotationlib
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class YYxClassAnnotation {
}
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class TestAnnotation(vararg val value: String = [])
annotation class Special(val why: String)
