/*
** BubbleSort
*/

void sirala(int dizi[], int uzunluk){
    /*
    ** Kendisine sirasiz olarak verilen diziyi BubbleSort yontemi
    ** ile kucukten buyuge siralayan fonksiyon.
    **
    ** UYARI::
    **   Yapilan degisiklikler parametre olarak verilen dizinin uzerinde
    **   gerceklesir. Yani bu fonksiyona verilen dizi islendikten sonra
    **   eski haline dondurulemez.
    */
    int i;
    int j;
    int temp;

    i = uzunluk; // TODO: Tersten gidisi duzenle!
    while (i > 0) {
        j = 0;
        while (j < i){
            if (dizi[j] > dizi[j+1]){
                // ---SWAP (Degisim)
                temp = dizi[j];
                dizi[j] = dizi[j+1];
                dizi[j+1] = temp;
                // ---SWAP (Degisim)
            }
            j++;
        }
        i--;
    }
}
