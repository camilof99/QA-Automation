package com.sophosolutions.task;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.support.ui.Wait;

import com.sophosolutions.interactions.ClickDoubleButton;
import com.sophosolutions.interactions.DateTimeSelect;
import com.sophosolutions.interactions.GetFilterData;
import com.sophosolutions.interactions.GetFilterData2;
import com.sophosolutions.interactions.NiñosSelect;
import com.sophosolutions.interactions.SetPause;
import com.sophosolutions.ui.BookingBuscarPage;
import com.sophosolutions.ui.BookingResultFiltersPage;

import io.cucumber.messages.types.Duration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SetFilters implements Task{
		Target tgtBtnFilterList;
		Target tgtBtnFilterPrice;
		Target tgtBtnFilterPunt;
		Target tgtButtonElement;
		Target tgtPuntElement;
		Target tgtComeElement;
		Target tgtConfortElement;
		Target tgtDivElement;
		int intSetFilters;

		public SetFilters(Map<String, Target> dataTarget, int intSetFilters) {
			super();

			this.tgtBtnFilterPrice = dataTarget.get("tgtBtnFilterPrecio");
			this.tgtBtnFilterPunt = dataTarget.get("tgtBtnFilterPunt");
			this.tgtBtnFilterList = dataTarget.get("tgtBtnFilterList");
			this.tgtButtonElement = dataTarget.get("tgtButtonElement");
			this.tgtPuntElement = dataTarget.get("tgtPuntElement");
			this.tgtComeElement = dataTarget.get("tgtComeElement");
			this.tgtDivElement = dataTarget.get("tgtDivElement");
			this.tgtConfortElement = dataTarget.get("tgtConfortElement");

			this.intSetFilters = intSetFilters;

		}

		@Override
		public <T extends Actor> void performAs(T actor) {
			
			System.out.println(77);
			
			System.out.println("Tipo de filtro: " + intSetFilters);
			
			if(intSetFilters == 1) {
				actor.attemptsTo(
					
						WaitUntil.the(tgtBtnFilterPunt, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
						Click.on(tgtBtnFilterPunt),
						SetPause.time(),
						Click.on(tgtBtnFilterList),
						Click.on(tgtBtnFilterPrice),
						WaitUntil.the(tgtDivElement, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
						GetFilterData.dateTime(
								tgtButtonElement, tgtPuntElement, 
								tgtComeElement)
					);
			}else {
				actor.attemptsTo(
						WaitUntil.the(tgtBtnFilterList, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
						Click.on(tgtBtnFilterList),
						Click.on(tgtBtnFilterPrice),
						WaitUntil.the(tgtDivElement, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
						GetFilterData2.dateTime(
								tgtButtonElement, tgtConfortElement)
					);
			}
		}

		public static SetFilters formData(int SetFilters)
				throws IllegalArgumentException, IllegalAccessException {

			return Tasks.instrumented(SetFilters.class, dataTarget(), SetFilters);
		}
		
		public static Map<String, Target> dataTarget() throws IllegalArgumentException, IllegalAccessException {
			Map<String, Target> data = new HashMap<String, Target>();
			
			
			Field[] fields = BookingResultFiltersPage.class.getDeclaredFields();

			for (Field field : fields) {
				data.put(field.getName(), (Target) field.get(null));
			}

			return data;
		}
}
