/*
 * NSIS Ant Task
 * Copyright (c) 2004 Wayne Grant. Relicensed with permission.
 * Copyright (c) 2005-2010 Daniel Reese
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.danielreese.nsisant;

/**
 * Represents an NSIS command to execute in the context of the build script.
 */
public class Scriptcmd
{
	// Fields
	/** Stores the cmd attribute */
	private String m_sCmd;

	// Methods
	/**
	 * Set the cmd attribute.
	 * 
	 * @param sCmd Attribute value
	 */
	public void setCmd(String sCmd)
	{
		m_sCmd = sCmd;
	}

	/**
	 * Get the cmd attribute. Deliberately package private.
	 * 
	 * @return Attribute value
	 */
	String getCmd()
	{
		return m_sCmd;
	}
}
