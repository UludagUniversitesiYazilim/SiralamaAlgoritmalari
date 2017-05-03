/*
 * SelectionSort
 */

#include <stdio.h>

#define False -1

int en_kucuk(int[], int, int);
void sirala(int[], int);
void dizi_yazdir(int[], int);

int en_kucuk(int dizi[], int uzunluk, int start_index){
    /*
    ** Bu fonksiyon parametre olarak verilen
    ** listedeki en kucuk elemanin dizi indexini
    ** dondurur.
    **
    ** Elemanlari kontrol ederken baslangic indexi olarak
    ** parametre olarak verilen start_index degerini alir.
    **
    */

    // --- KONTROL ---
    if (start_index > uzunluk - 1){
        return False; // Baslangic elemani dizinin boyutundan buyuk.
    }
    // ---KONTROL ---


    int temp; // En kucuk verinin tutuldugu
    int temp_index; // Rn kucuk verinin indexinin tutuldugu
    int i;

    i = start_index; //FIXME: Ilklemeler duzenlenebilir. Dongu icine alinabilir.
    temp = dizi[i];   //FIXME: Ilklemeler duzenlenebilir. Dongu icine alinabilir.
    temp_index = i;  //FIXME: Ilklemeler duzenlenebilir. Dongu icine alinabilir.

    while (i < uzunluk){
        if (dizi[i] < temp){
            temp_index = i;
            temp = dizi[i];
        }
        i++;
    }

    return temp_index;
}

void sirala(int dizi[], int uzunluk){
    /*
    ** Verilen bir dizinin elemanlarini SelectionSort (Secerek Siralama) yontemi
    ** ile siralayan fonksiyondur.
    **
    ** UYARI::
    **   Yapilan degisiklikler parametre olarak verilen dizinin uzerinde
    **   gerceklesir. Yani bu fonksiyona verilen dizi islendikten sonra
    **   eski haline donedurulemez.
    */

    int temp;
    int temp_index;
    int i;

    i = 0;
    while (i < uzunluk){
        temp_index = en_kucuk(dizi, uzunluk, i);

        // -- Swapping (Degistirme) --
        temp = dizi[temp_index];
        dizi[temp_index] = dizi[i];
        dizi[i] = temp;
        // -- Swapping (Degistirme) --

        i++;
    }

}
