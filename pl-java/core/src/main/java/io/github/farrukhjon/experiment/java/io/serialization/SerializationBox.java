package io.github.farrukhjon.experiment.java.io.serialization;

import java.io.Serializable;

public class SerializationBox implements Serializable {

	private static final long	serialVersionUID	= 5459565391131916052L;

	private byte serializableProp = 10;

	public int getSerializableProp() {
		return serializableProp;
	}
}
