package com.programacaoweb.proxme.util;

import java.util.Collection;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Util {

	public static boolean isBlank(final String valor) {
		return isEmpty(valor) || valor.trim().length() == 0;
	}

	public static boolean isEmpty(String valor) {
		return StringUtils.isEmpty(valor);
	}

	public static boolean isEmpty(Collection<?> collection) {
		return CollectionUtils.isEmpty(collection);
	}

	public static boolean isNull(Object obj) {
		return obj == null;
	}
}
