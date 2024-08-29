package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    		int cantidadEnteros = this.getCantidadEnteros();
    		
    		int[] copiaArray = new int[cantidadEnteros];
    		
    		for (int i = 0; i < cantidadEnteros; i++) {
    			
    			 copiaArray[i] = this.arregloEnteros[i];
    		}
    		
    		return copiaArray;
    			
        
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    		int cantidadCadenas = this.getCantidadCadenas();
    		
    		String[] copiaArray = new String[cantidadCadenas];
    		
    		for (int i = 0; i < cantidadCadenas; i++) {
    			
    			copiaArray[i] = this.arregloCadenas[i];
    		}
    		
    		return copiaArray;
    
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int cantidadValores = this.arregloEnteros.length;
        
    	return cantidadValores;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int cantidadValores = this.arregloCadenas.length;
        
    	return cantidadValores;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
        
        int[] nuevoArray = new int[cantidadEnteros + 1];
        
        for (int i = 0; i < cantidadEnteros; i++) {
            nuevoArray[i] = this.arregloEnteros[i];
        }
        
        nuevoArray[cantidadEnteros] = entero;
        
        this.arregloEnteros = nuevoArray;
			
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int cantidadCadenas = this.getCantidadCadenas();
        
        String[] nuevoArray = new String[cantidadCadenas + 1];
        
        for (int i = 0; i < cantidadCadenas; i++) {
            nuevoArray[i] = this.arregloCadenas[i];
        }
        
        nuevoArray[cantidadCadenas] = cadena;
        
        this.arregloCadenas = nuevoArray;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int aparicionesValor = this.contarApariciones(valor);
    	int cantidadEnteros = this.getCantidadEnteros();
    	
    	if ( aparicionesValor > 0) {
    		int[] nuevoArray = new int[cantidadEnteros - aparicionesValor];
    		
    		int j = 0;
    		
    		for (int i = 0; i < cantidadEnteros; i++) {
    			if (this.arregloEnteros[i] != valor) {
    				nuevoArray[j] = this.arregloEnteros[i];
                    j++;
    			}
    		}
    		
    		 this.arregloEnteros = nuevoArray;
    	}
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int aparicionesCadena = this.contarApariciones(cadena);
        int cantidadCadenas = this.getCantidadCadenas();
        
        if (aparicionesCadena > 0) {
        	
        	String[] nuevoArray = new String[cantidadCadenas - aparicionesCadena];
        	
        	int j = 0;
        	
        	for (int i = 0; i < cantidadCadenas; i++) {
                if (this.arregloCadenas[i] != null && !this.arregloCadenas[i].equals(cadena)) {
                    nuevoArray[j] = this.arregloCadenas[i];
                    j++;
                }
            }
        	
        	this.arregloCadenas = nuevoArray;
        }

    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
    	
    	int[] nuevoArray = new int[cantidadEnteros + 1];
    	
    	for (int i = 0; i < posicion; i++) {
    		nuevoArray[i] = this.arregloEnteros[i];
    	}
    	
    	nuevoArray[posicion] = entero;
    	
    	for (int i = posicion + 1; i <= cantidadEnteros; i++) {
            nuevoArray[i] = this.arregloEnteros[i - 1];
            
    	}
    	
    	this.arregloEnteros = nuevoArray;
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
    	
    	int[] nuevoArray = new int[cantidadEnteros - 1];
    	
    	if (posicion > 0 && posicion >= cantidadEnteros) {
    		
    		for (int i = 0; i < posicion; i++) {
    	        nuevoArray[i] = this.arregloEnteros[i];
    	    }
    		
    		for (int i = posicion; i < cantidadEnteros - 1; i++) {
    	        nuevoArray[i] = this.arregloEnteros[i + 1];
    	    }
    	}
    	
    	this.arregloEnteros = nuevoArray;
    	
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int cantidadValores = valores.length;
        int[] nuevoArray = new int[cantidadValores];
        
        for (int i = 0; i < cantidadValores; i++) {
        	nuevoArray[i] = (int) valores[i];
        }
        
        this.arregloEnteros = nuevoArray;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int cantidadObjetos = objetos.length;
    	
    	String[] nuevoArray = new String[cantidadObjetos];
    	
    	for (int i = 0; i < cantidadObjetos; i++) {
            nuevoArray[i] = objetos[i].toString();
    	}
    	this.arregloCadenas = nuevoArray;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int cantidadEnteros = this.getCantidadEnteros();

        for (int i = 0; i < cantidadEnteros; i++) {
            this.arregloEnteros[i] = Math.abs(this.arregloEnteros[i]);
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(this.arregloEnteros);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(this.arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {	
    	int cantidadEnteros = this.getCantidadEnteros();
    	
        int contador = 0;
        
        for (int i = 0; i < cantidadEnteros; i++) {
        
        	if (this.arregloEnteros[i] == valor) {
                contador++;
            }
        }
        
        return contador;
       
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int cantidadCadenas = this.getCantidadCadenas();
    	
        int contador = 0;
        
        for (int i = 0; i < cantidadCadenas; i++) {
        
        	if (this.arregloCadenas[i].equals(cadena)) {
                contador++;
            }
        }
        
        return contador;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
    	int contador = 0;
 
    	
    	for (int i = 0; i < cantidadEnteros; i++) {
    		if (this.arregloEnteros[i] == valor) {
    			contador++;
            }
    		
    	}

        int[] nuevoArray = new int[contador];
        int posicion = 0;
        
        for (int i = 0; i < cantidadEnteros; i++) {
            if (this.arregloEnteros[i] == valor) {
                nuevoArray[posicion] = i;
                posicion++;
            }
        }

        return nuevoArray; 
    }

    	
   

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
        int[] rango; 

        if (cantidadEnteros == 0) {
            
            rango = new int[0];
        } else {
            
            rango = new int[2];
            
            rango[0] = this.arregloEnteros[0];
            
            rango[1] = this.arregloEnteros[0];

            
            for (int i = 1; i < cantidadEnteros; i++) {
                int valor = this.arregloEnteros[i];
                
                if (valor < rango[0]) {
                    rango[0] = valor; 
                    
                } else if (valor > rango[1]) {
                    rango[1] = valor; 
                }
            }
        }

        return rango; 
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
    	
    	int cantidadEnteros = this.getCantidadEnteros();
         
    	 for (int i = 0; i < cantidadEnteros; i++) {
    	        int valor = this.arregloEnteros[i]; 

    	        if (histograma.containsKey(valor)) {
    	            
    	            int cantidadLlaves = histograma.get(valor);
    	            
    	            histograma.put(valor, cantidadLlaves + 1);
    	        } else {
    	            
    	            histograma.put(valor, 1);
    	        }
    	    }

    	    return histograma; 
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
        int contador = 0;
        
        if (cantidadEnteros > 0) {
            this.organizarEnteros();

            int apariciones = 1;
            int currentNum = this.arregloEnteros[0];
            boolean repetido = false;

            for (int i = 1; i < cantidadEnteros; i++) {
                int valor = this.arregloEnteros[i];
                
                if (valor == currentNum) {
                    apariciones++;
                } else {
                    if (apariciones > 1 && !repetido) {
                        contador++;
                        repetido = true;
                    } else {
                        repetido = false;
                    }
                    currentNum = valor;
                    apariciones = 1;
                }
            }
            
            
            if (apariciones > 1 && !repetido) {
                contador++;
            }
        }
        
        return contador;

           
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	 int cantidadEnteros = this.getCantidadEnteros();
    	    int cantidadOtro = otroArreglo.length;

    	    if (cantidadEnteros != cantidadOtro) {
    	        return false; 
    	    }

    	    this.organizarEnteros();
    	    Arrays.sort(otroArreglo);
    	    
    	    return Arrays.equals(this.arregloEnteros, otroArreglo);
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	int cantidadEnteros = this.getCantidadEnteros();
        int cantidadOtro = otroArreglo.length;

        if (cantidadEnteros != cantidadOtro) {
           
        }

        this.organizarEnteros();
        Arrays.sort(otroArreglo);


        HashMap<Integer, Integer> histogramaActual = new HashMap<>();
        HashMap<Integer, Integer> histogramaOtro = new HashMap<>();

        for (int i = 0; i < cantidadEnteros; i++) {
            histogramaActual.put(this.arregloEnteros[i], histogramaActual.getOrDefault(this.arregloEnteros[i], 0) + 1);
            histogramaOtro.put(otroArreglo[i], histogramaOtro.getOrDefault(otroArreglo[i], 0) + 1);
        }

        return histogramaActual.equals(histogramaOtro);
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	if (cantidad <= 0) {
            
            throw new IllegalArgumentException("La cantidad necesita ser mayor que cero para calcular.");
            
        } else {
            
            this.arregloEnteros = new int[cantidad];

            
            for (int i = 0; i < cantidad; i++) {
                int entero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
                this.arregloEnteros[i] = entero;
            }

            
            this.organizarEnteros();
        }
    }

    }
