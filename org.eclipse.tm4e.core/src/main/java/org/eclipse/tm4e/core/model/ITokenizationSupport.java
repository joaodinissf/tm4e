/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * This code is an translation of code copyrighted by Microsoft Corporation, and initially licensed under MIT.
 *
 * Contributors:
 *  - Microsoft Corporation: Initial code, written in TypeScript, licensed under MIT license
 *  - Angelo Zerr <angelo.zerr@gmail.com> - translation and adaptation to Java
 */
package org.eclipse.tm4e.core.model;

public interface ITokenizationSupport {

	TMState getInitialState();

	LineTokens tokenize(String line, TMState state);
	
	// add offsetDelta to each of the returned indices
	// stop tokenizing at absolute value stopAtOffset (i.e. stream.pos() +
	// offsetDelta > stopAtOffset)
	LineTokens tokenize(String line, TMState state, Integer offsetDelta, Integer stopAtOffset);

}