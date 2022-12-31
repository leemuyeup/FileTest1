package com.example.demo.exception;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String msg){ super(msg); }
}

