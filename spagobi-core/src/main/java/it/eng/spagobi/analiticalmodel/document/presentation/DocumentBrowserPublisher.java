/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.analiticalmodel.document.presentation;

import it.eng.spago.base.RequestContainer;
import it.eng.spago.base.ResponseContainer;
import it.eng.spago.base.SourceBean;
import it.eng.spago.error.EMFErrorHandler;
import it.eng.spago.error.EMFErrorSeverity;
import it.eng.spago.error.EMFUserError;
import it.eng.spago.presentation.PublisherDispatcherIFace;
import it.eng.spagobi.commons.constants.SpagoBIConstants;
import it.eng.spagobi.commons.utilities.GeneralUtilities;
import it.eng.spagobi.commons.utilities.SpagoBITracer;
import it.eng.spagobi.utilities.themes.ThemesManager;
/**
 * Publishes the correct document browser 
 * jsp page according to what contained into request. If Any errors occurred during the 
 * execution, the publisher
 * is able to call the error page with the error message caught before and put into 
 * the error handler. If the input information don't fall into any of the cases declared,
 * another error is generated. 
 * 
 * @author Francesco Lucchi (francesco.lucchi@eng.it)
 */
public class DocumentBrowserPublisher implements PublisherDispatcherIFace {

	/**
	 * Given the request at input, gets the name of the reference publisher,driving
	 * the execution into the correct jsp page, or jsp error page, if any error occurred.
	 * 
	 * @param requestContainer The object containing all request information
	 * @param responseContainer The object containing all response information
	 * 
	 * @return A string representing the name of the correct publisher, which will
	 * call the correct jsp reference.
	 */
	public String getPublisherName(RequestContainer requestContainer, ResponseContainer responseContainer) {

		SpagoBITracer.debug(SpagoBIConstants.NAME_MODULE, 
	            "DocumentBrowserPublisher", 
	            "getPublisherName", 
	            "[BEGIN]");
		
		EMFErrorHandler errorHandler = responseContainer.getErrorHandler();
		
		String publisher = "UserDocumentBrowserDefaultPublisher";
		
		String currTheme=ThemesManager.getCurrentTheme(requestContainer);
        if(currTheme != null && currTheme.equals("fiware")){
    		publisher = "UserDocumentBrowserFiwarePublisher";
    	}
        
        SpagoBITracer.debug(SpagoBIConstants.NAME_MODULE, 
	            "DocumentBrowserPublisher", 
	            "getPublisherName", 
	            "redirect to publisher: " + publisher);
        
		return publisher;
	}

}
