/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.tm4e.core.internal.grammar;

import org.eclipse.tm4e.core.grammar.IToken;
import org.eclipse.tm4e.core.grammar.ITokenizeLineResult;
import org.eclipse.tm4e.core.grammar.StackElement;

/**
 * 
 * Result of the line tokenization implementation.
 *
 */
public class TokenizeLineResult implements ITokenizeLineResult {

	private final IToken[] tokens;
	private final StackElement ruleStack;

	public TokenizeLineResult(IToken[] tokens, StackElement ruleStack) {
		this.tokens = tokens;
		this.ruleStack = ruleStack;
	}

	@Override
	public IToken[] getTokens() {
		return tokens;
	}

	@Override
	public StackElement getRuleStack() {
		return ruleStack;
	}

}
