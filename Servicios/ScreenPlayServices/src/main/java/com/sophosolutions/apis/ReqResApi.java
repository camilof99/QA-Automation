package com.sophosolutions.apis;

import java.io.IOException;

import com.sophosolutions.restinteractions.RestInteraction;
import com.sophosolutions.restinteractions.RestPrueba;

import io.cucumber.datatable.DataTable;

public class ReqResApi {

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
		RestInteraction.validateField("data." + strFieldKey, strFieldValue);
	}

	public static void executePostRest(String strEndPoint, String strData) throws IOException {

		RestInteraction.executePostRest(strEndPoint, strData, HeroesRestApi.STR_TOKEN);
	}

	public static void validateJsonSchema(String strSchema) {
		RestInteraction.validateJsonSchema(strSchema);
	}

	public static void prueba() {
		RestPrueba.prueba();
	}

}
