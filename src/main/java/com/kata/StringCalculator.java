package com.kata;

import java.util.Arrays;

public class StringCalculator {

    private static final int RESULT_EMPTY_STRING = 0;

    public int calcular(String numeros) {
        int resultado = RESULT_EMPTY_STRING;
        
        if(numeros == null) {
        	throw new IllegalArgumentException();
        }else if(!numeros.isEmpty()) {
        	resultado = calcularNumerosString(numeros);
        }

        return resultado;
    }

    private void checkContainsOnlyNumbers(String numeros) {
    	if(numeros.matches("[A-Za-z]*")) {
    		throw new IllegalArgumentException();
    	}
    	
    }
    
	private int calcularNumerosString(String numeros) {
		checkContainsOnlyNumbers(numeros);

		return Arrays.asList(
				numeros.split(","))
				.stream()
				.mapToInt(Integer::valueOf)
				.sum();
	}
}
