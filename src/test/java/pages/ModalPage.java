package pages;

import elements.ModalElements;
import methods.Methods;
import utilities.StringData;

public class ModalPage {
	
	Methods method = new Methods();
	ModalElements ml = new ModalElements();
	StringData sd = new StringData();
	
	public void openSmallModal() {
		method.click(ml.btnSmallModal, "Click on Small Modal button");
	}
	
	public void validateSmallModal() {
		method.textValidation(ml.textSmall, sd.textSmallModal, "Validate small modal text");
		method.click(ml.btnCloseSmall, "Close small modal");
	}
	
	public void openLargeModal() {
		method.click(ml.btnLargeModal, "Click on Large Modal button");
	}
	
	public void validateLargeModal() {
		method.textValidation(ml.textLarge, sd.textLargeModal, "Validate large modal text");
		method.click(ml.btnCloseLarge, "Close large modal");
	}

}
