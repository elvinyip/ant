/*
 * Copyright (C) The Apache Software Foundation. All rights reserved.
 *
 * This software is published under the terms of the Apache Software License
 * version 1.1, a copy of which has been included with this distribution in
 * the LICENSE file.
 */
package org.apache.ant.modules.basic;

import org.apache.myrmidon.converter.AbstractConverter;
import org.apache.myrmidon.converter.ConverterException;
import org.apache.avalon.framework.context.Context;

/**
 * String to byte converter
 *
 * @author <a href="mailto:donaldp@apache.org">Peter Donald</a>
 */
public class StringToByteConverter
    extends AbstractConverter
{
    public StringToByteConverter()
    {
        super( String.class, Byte.class );
    }

    public Object convert( final Object original, final Context context )
        throws ConverterException
    {
        try { return new Byte( (String)original ); }
        catch( final NumberFormatException nfe )
        {
            throw new ConverterException( "Error formatting object", nfe );
        }

    }
}

