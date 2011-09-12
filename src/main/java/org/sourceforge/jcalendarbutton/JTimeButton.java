/*
 * TimeButton.java

 * @author Don Corley <don@tourgeek.com>
 * @version 1.0.0
  
 * Copyright © 2011 jbundle.org. All rights reserved.
 */
package org.sourceforge.jcalendarbutton;

import java.util.Date;

/** 
 * Maintain backwards compatibility when I fixed the package name.
 */
@Deprecated
public class JTimeButton extends org.jbundle.util.jcalendarbutton.JTimeButton
{
	private static final long serialVersionUID = 1L;

    
    /**
     * Creates new TimeButton.
     */
    public JTimeButton()
    {
        super();
    }
    /**
     * Creates new TimeButton.
     * @param dateTarget The initial date for this button.
     */
    public JTimeButton(Date timeTarget)
    {
    	super(timeTarget);
    }
    /**
     * Creates new TimeButton.
     * @param strDateParam The name of the date property (defaults to 'date').
     * @param dateTarget The initial date for this button.
     */
    public JTimeButton(String strDateParam, Date timeTarget)
    {
    	super(strDateParam, timeTarget);
    }
    /**
     * Creates new TimeButton.
     * @param strDateParam The name of the date property (defaults to 'date').
     * @param dateTarget The initial date for this button.
     * @param strLanguage The language to use.
     */
    public JTimeButton(String strDateParam, Date timeTarget, String strLanguage)
    {
    	super(strDateParam, timeTarget, strLanguage);
    }
}
