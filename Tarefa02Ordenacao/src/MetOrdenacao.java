/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IGOR-ASUS
 */
public class MetOrdenacao {

    public static void selecao(Vetor v[], int n) {
        for (int i = 1; i < v.length; i++) {
            int menor = i;
            Vetor x = v[i];
            for (int j = menor + 1; i < v.length; i++) {
                if (x.compara(v[j]) < x.compara(v[menor])) {
                    menor = j;
                }
            }
            if (menor != i) {
                x = v[i];
                v[i] = v[menor];
                v[menor] = x;
            }
        }
    } // fim do método selecao

    public static void insercao(Vetor v[], int n) {
        //Implementação completa
        int j;
        for (int i = 2; i <= n; i++) {
            Vetor x = v[i];
            j = i - 1;
            v[0] = x;
            while (x.compara(v[j]) < 0) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = x;
        }
    } // fim do método insercao

    public static void bubblesort(Vetor v[], int n) {

// Coloque neste espaço o seu código do método bubblesort
    } // fim metodo bubblesort

    public static void shellsort(Vetor v[], int n) {
        int h = 1;
        do {
            h = h * 3 + 1;
        } while (h < n);
        do {
            h /= 3;
            for (int i = h + 1; i <= n; i++) {
                Vetor x = v[i];
                int j = i;
                while (v[j - h].compara(x) > 0) {
                    v[j] = v[j - h];
                    j -= h;
                    if (j <= h) {
                        break;
                    }
                }
                v[j] = x;
            }
        } while (h != 1);
    } // fim do método shellsort 

    public static void quicksort(Vetor v[], int n) {
        /* Coloque neste espaço o seu código do método quicksort, se
necessário criar outras rotinas ou métodos insira-os antes este
método
         */
    } // fim do método quicksort

    public static void heapsort(Vetor v[], int n) {
        //Implementação completa
        FilaPriHeap fpHeap1 = new FilaPriHeap(v);
        int dir = n;
        fpHeap1.constroi();
        while (dir > 1) {
            Vetor x = v[1];
            v[1] = v[dir];
            v[dir] = x;
            dir--;
            fpHeap1.refaz(1, dir);
        }
    } // fim do método heapsort
} // fim da classe MetOrdenacao 
