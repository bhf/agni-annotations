package com.bhf.agni.annotations.llm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation for code that needs to be alerted
 * on if an LLM or AI agent modifies it. Should alert the
 * user of the LLM or AI agent explicitly that the code
 * annotated with this is being changed.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CheckBeforeModifying {
}

