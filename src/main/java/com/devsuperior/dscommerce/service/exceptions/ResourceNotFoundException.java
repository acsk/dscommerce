package com.devsuperior.dscommerce.service.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {


	public ResourceNotFoundException (String msg) {
		super(msg);
	}
	
}
