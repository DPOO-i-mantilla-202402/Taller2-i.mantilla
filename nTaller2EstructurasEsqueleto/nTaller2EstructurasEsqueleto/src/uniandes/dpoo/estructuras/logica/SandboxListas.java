package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    public List<Integer> getCopiaEnteros( )
    {
        List<Integer> nuevaList = new ArrayList<Integer>(this.listaEnteros);
        
        return nuevaList;
    }

    /**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */
    public List<String> getCopiaCadenas( )
    {
    	List<String> nuevaList = new LinkedList<String>(this.listaCadenas);
        
        return nuevaList;
    }

    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaño que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */
    public int[] getEnterosComoArreglo( )
    {
    	int cantidadEnterosLista = this.getCantidadEnteros();
		
		int[] Array = new int[cantidadEnterosLista];
		
		for (int i = 0; i < cantidadEnterosLista; i++) {
			
			 Array[i] = this.listaEnteros.get(1);
		}
		
		return Array;
    }

    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        int cantidadEnteros = this.listaEnteros.size();
        
        return cantidadEnteros;
    }

    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int cantidadCadenas= this.listaCadenas.size();
    	
    	if (cantidadCadenas>0);
    	
    	return cantidadCadenas;
    }

    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este método siempre debería aumentar en 1 el tamaño de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	this.listaEnteros.add(entero);
    }

    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este método siempre debería aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	this.listaCadenas.add(cadena);
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {	
    	int cantidadEnteros = this.listaEnteros.size();
        
        for (int i = cantidadEnteros - 1; i >= 0; i--) {
            
            int valorLista= this.listaEnteros.get(i);
            
            if (valorLista == valor) {
                
                this.listaEnteros.remove(i);
            }
        }
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int cantidadCadenas = this.listaCadenas.size();
        
        for (int i = cantidadCadenas - 1; i >= 0; i--) {
            // Obtener el valor en la posición i
            String valorLista = this.listaCadenas.get(i);
            
            if (valorLista.equals(cadena)) {
                
                this.listaCadenas.remove(i);
            }
        }
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en la lista aumentada. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño de la lista, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int cantidadEnteros = this.listaEnteros.size();
        
        if (posicion >= 0 && posicion <= cantidadEnteros) {
            this.listaEnteros.add(posicion, entero);
        } else {
            throw new IndexOutOfBoundsException("La posición es inválida.");
        }
    }


    /**
     * Elimina un valor de la lista de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición de la lista de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int cantidadEnteros = this.listaEnteros.size();

        if (posicion >= 0 && posicion < cantidadEnteros) {
        	
            this.listaEnteros.remove(posicion);
        }
    }

    /**
     * Reinicia la lista de enteros con los valores contenidos en el parámetro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	List<Integer> nuevaListaEnteros = new ArrayList<>(valores.length);
        
        for (int i = 0; i < valores.length; i++) {
        	nuevaListaEnteros.add((int) valores[i]);
        }
        
        this.listaEnteros = nuevaListaEnteros;
    }

    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarArregloCadenas( List<Object> objetos )
    {
    	 List<String> nuevaListaCadenas = new LinkedList<>();
    	    
    	    for (int i = 0; i < objetos.size(); i++) {
    	        nuevaListaCadenas.add(objetos.get(i).toString());
    	    }
    	    
    	    this.listaCadenas = nuevaListaCadenas;
    }

    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int cantidadEnteros = this.listaEnteros.size();
    	
    	for (int i = 0; i < cantidadEnteros ; i++) {
            listaEnteros.set(i, Math.abs(listaEnteros.get(i)));
        }
    }
    

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {
    	int cantidadEnteros = this.listaEnteros.size();

        for (int i = 0; i < cantidadEnteros; i++) {
            int posicionMin = i;

            for (int j = i + 1; j < cantidadEnteros; j++) {
                if (this.listaEnteros.get(j) < this.listaEnteros.get(posicionMin)) {
                	posicionMin = j;
                }
            }

            
            if (posicionMin != i) {
                int valor = this.listaEnteros.get(i);
                this.listaEnteros.set(i, this.listaEnteros.get(posicionMin));
                this.listaEnteros.set(posicionMin, valor);
            }
        }
    }


    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	 {
    	    	int cantidadCadenas = this.listaCadenas.size();

    	        for (int i = 0; i < cantidadCadenas; i++) {
    	            int posicionMin = i;

    	            for (int j = i + 1; j < cantidadCadenas; j++) {
    	            	if (this.listaCadenas.get(j).compareTo(this.listaCadenas.get(posicionMin)) < 0) {
    	                	posicionMin = j;
    	                }
    	            }

    	            
    	            if (posicionMin != i) {
    	                String valor = this.listaCadenas.get(i);
    	                this.listaCadenas.set(i, this.listaCadenas.get(posicionMin));
    	                this.listaCadenas.set(posicionMin, valor);
    	            }
    	        }
    	    }

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int cantidadEnteros = this.listaEnteros.size();
    	
    	int contador = 0;
    	    for (int i = 0; i < cantidadEnteros; i++) {
    	        if (this.listaEnteros.get(i) == valor) {
    	            contador++;
    	        }
    	    }
    	    return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en la lista de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int cantidadCadenas = this.listaCadenas.size();
    	
    	int contador = 0;
        for (int i = 0; i < cantidadCadenas; i++) {
            if (this.listaCadenas.get(i).equalsIgnoreCase(cadena)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	this.organizarEnteros(); 
        
    	int contador = 0;
    	
        int cantidadEnteros = this.listaEnteros.size();
        int apariciones = 1;
        int valorLista = this.listaEnteros.get(0);
        boolean repetido = false;

        for (int i = 1; i < cantidadEnteros; i++) {
            int valor = this.listaEnteros.get(i);
            
            if (valor == valorLista) {
                apariciones++;
            } else {
                if (apariciones > 1 && !repetido) {
                    contador++;
                    repetido = true;
                } else {
                    repetido = false;
                }
                valorLista = valor;
                apariciones = 1;
            }
        }

        if (apariciones > 1 && !repetido) {
            contador++;
        }

        return contador;
    }

    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        return false;
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad necesita ser mayor que cero para calcular.");
        }

        this.listaEnteros = new ArrayList<>(cantidad);
        
        for (int i = 0; i < cantidad; i++) {
            int entero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
            this.listaEnteros.add(entero);
        }
        
        this.organizarEnteros();
    }

}
