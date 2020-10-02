package com.xworkz.genarator;

import java.io.Serializable;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.LongType;
import org.hibernate.type.Type;

public class CustomGenerator extends SequenceStyleGenerator {

	public static final String VALUE_PREFIX_PARAMETER="valueprefix";
	public static final String VALUE_PREFIX_DEFAULT="";
	private String valueprefix;
	
	public static final String NUMBER_FORMAT_PARAMETER="numberformat";
	public static final String NUMBER_FORMAT_DEFAULT="%d";
	private String numberformat;

@Override
public Serializable generate(SessionImplementor session, Object object) throws HibernateException {

	return valueprefix+String.format(numberformat, super.generate(session, object));
}
	
@Override
public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {

	super.configure(LongType.INSTANCE, params, serviceRegistry);
	valueprefix=ConfigurationHelper.getString(VALUE_PREFIX_PARAMETER, params,VALUE_PREFIX_DEFAULT);
	numberformat=ConfigurationHelper.getString(NUMBER_FORMAT_PARAMETER, params,NUMBER_FORMAT_DEFAULT);
}
}
