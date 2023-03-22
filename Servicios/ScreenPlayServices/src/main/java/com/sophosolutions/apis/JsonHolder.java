package com.sophosolutions.apis;

import com.sophosolutions.restinteractions.RestInteraction;

public class JsonHolder {
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}

	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}

	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}

	public static void validateField(String strFieldKey, String strFieldValue) {
		RestInteraction.validateField(strFieldKey, strFieldValue);
	}
}
