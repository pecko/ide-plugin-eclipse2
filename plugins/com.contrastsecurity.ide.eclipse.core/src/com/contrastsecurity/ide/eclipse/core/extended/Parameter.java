/*******************************************************************************
 * Copyright (c) 2017 Contrast Security.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under 
 * the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License.
 * 
 * The terms of the GNU GPL version 3 which accompanies this distribution
 * and is available at https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * Contributors:
 *     Contrast Security - initial API and implementation
 *******************************************************************************/
package com.contrastsecurity.ide.eclipse.core.extended;

public class Parameter {
	private String parameter;
	private boolean tracked;
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public boolean isTracked() {
		return tracked;
	}
	public void setTracked(boolean tracked) {
		this.tracked = tracked;
	}

}
