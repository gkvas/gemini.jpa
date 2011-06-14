/*******************************************************************************
 * Copyright (c) 2010 Oracle.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at 
 *     http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *     mkeith - Gemini JPA tests 
 ******************************************************************************/
package model.xmlmapped;

/**
 * Test JPA model class
 * 
 * @author mkeith
 */
public class SimpleEntity2 {

    int id;
    int simpleInt;
 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public int getSimpleInt() { return simpleInt; }
    public void setSimpleInt(int simpleInt) { this.simpleInt = simpleInt; }

}
