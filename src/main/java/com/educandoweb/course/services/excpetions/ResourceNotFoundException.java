package com.educandoweb.course.services.excpetions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resounrce not found. Id " + id);
	}
	
}
