package uniandes.dpoo.estructuras.logica;

import java.util.List;

public class Sorts {

	/**
    * Un QuickSort para organizar array de enteros.
    */
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Método de partición para QuickSort.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    
    }
    
    /**
     * Bubble Sort para organizar listas de cadenas y enteros.
     */
    public static <E extends Comparable<E>> void bubbleSort(List<E> lista, boolean ascendente) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if ((ascendente && lista.get(j).compareTo(lista.get(j + 1)) > 0) ||
                    (!ascendente && lista.get(j).compareTo(lista.get(j + 1)) < 0)) {
                   
                    E temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
       }
    /**
     * Selection Sort para organizar arrays de cadenas.
     */
    public static void selectionSort(String[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j].compareTo(arreglo[indiceMinimo]) < 0) {
                    indiceMinimo = j;
                }
            }
            
            String temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }
    }
    }