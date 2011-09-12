/*
 * CalendarButton.java
 *
 * @author Don Corley <don@tourgeek.com>
 * @version 1.0.0
 
 * Copyright © 2011 jbundle.org. All rights reserved.
 */
package net.sourceforge.jcalendarbutton;

import java.util.Date;

/** 
 * Maintain backwards compatibility when I fixed the package name.
 */
@Deprecated
public class JCalendarButton extends org.jbundle.util.jcalendarbutton.JCalendarButton
{
    private static final long serialVersionUID = 1L;

    /**
     * Creates new CalendarButton.
     */
    public JCalendarButton()
    {
        super();
    }
    /**
     * Creates new CalendarButton.
     * @param dateTarget The initial date for this button.
     */
    public JCalendarButton(Date dateTarget)
    {
        super(dateTarget);
    }
    /**
     * Creates new CalendarButton.
     * @param strDateParam The name of the date property (defaults to "date").
     * @param dateTarget The initial date for this button.
     */
    public JCalendarButton(String strDateParam, Date dateTarget)
    {
    	super(strDateParam, dateTarget);
    }
    /**
     * Creates new CalendarButton.
     * @param strDateParam The name of the date property (defaults to "date").
     * @param dateTarget The initial date for this button.
     * @param strLanguage The language to use.
     */
    public JCalendarButton(String strDateParam, Date dateTarget, String strLanguage)
    {
    	super(strDateParam, dateTarget, strLanguage);
    }
}
