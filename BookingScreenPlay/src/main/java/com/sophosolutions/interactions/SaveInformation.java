package com.sophosolutions.interactions;

import com.sophosolutions.models.InformationData;
import com.sophosolutions.questions.TextOf;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SaveInformation implements Interaction{

	Target tgtFechaEntrada;
	Target tgtFechaSalida;
	Target tgtDuracion;
	Target tgtPrecio;

	public SaveInformation(Target tgtFechaEntrada, Target tgtFechaSalida,
			Target tgtDuracion, Target tgtPrecio) {
		super();
		this.tgtFechaEntrada = tgtFechaEntrada;
		this.tgtFechaSalida = tgtFechaSalida;
		this.tgtDuracion = tgtDuracion;
		this.tgtPrecio = tgtPrecio;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		System.out.println(100);
		
		String strFechaEntrada = TextOf.field(tgtFechaEntrada).answeredBy(actor);
		String strFechaSalida = TextOf.field(tgtFechaSalida).answeredBy(actor);
		String strTextDuracion = TextOf.field(tgtDuracion).answeredBy(actor);
		String strPrecio = TextOf.field(tgtPrecio).answeredBy(actor);
		
		actor.remember("InfoData", new InformationData(strFechaEntrada, strFechaSalida,
				strTextDuracion, strPrecio));
	}

	public static SaveInformation withMessage(Target tgtFechaEntrada, Target tgtFechaSalida,
			Target tgtDuracion, Target tgtPrecio) {
		return Tasks.instrumented(SaveInformation.class, 
				tgtFechaEntrada, tgtFechaSalida,
				tgtDuracion, tgtPrecio);
	}
}
