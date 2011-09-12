/*
 * JTimePopup.java
 *
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
public class JTimePopup extends org.jbundle.util.jcalendarbutton.JTimePopup
{
	private static final long serialVersionUID = 1L;

	/**
     * Creates new form TimePopup.
     */
    public JTimePopup()
    {
        super();
    }
    /**
     * Creates new form TimePopup.
     * @param date The initial date for this button.
     */
    public JTimePopup(Date date)
    {
        super(date);
    }
    /**
     * Creates new form TimePopup.
     * @param strDateParam The name of the date property (defaults to "date").
     * @param date The initial date for this button.
     */
    public JTimePopup(String strDateParam, Date date)
    {
        super(strDateParam, date);
    }
    /**
     * Creates new form TimePopup.
     * @param strDateParam The name of the date property (defaults to "date").
     * @param date The initial date for this button.
     * @param strLanguage The language to use.
     */
    public JTimePopup(String strDateParam, Date date, String strLanguage)
    {
        super(strDateParam, date, strLanguage);
    }
}
