import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int numSwaps = 0; // bölümlendirme işleminde yapılan swap sayısını takip etmek için
    private static int numComparisons = 0; // bölümlendirme işleminde yapılan karşılaştırma sayısını takip etmek için


    public static void main(String[] args) {
        // kullanıcıdan dizi boyutu alınıyor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dizi boyutunu giriniz: ");
        int size = scanner.nextInt();

        // pivot index kullanıcıdan alınıyor
        System.out.print("Lütfen pivot indeksini giriniz (0'dan başlayarak): ");
        int pivotIndex = scanner.nextInt();

        // rasgele dizi oluşturuluyor ve yazdırılıyor
        int[] arr = createRandomArray(size);
        System.out.println("\nOluşturulan dizi: " + Arrays.toString(arr));

        // kullanıcının belirlediği pivot indeksi için quicksort işlemi yapılıyor ve yapılan işlem sayısı yazdırılıyor
        int[] arrCopy = Arrays.copyOf(arr, size); // sıralama için dizi kopyalanıyor
        numSwaps = 0;
        numComparisons = 0;
        quickSort(arrCopy, 0, size - 1, pivotIndex);
        System.out.println("Sıralanmış Dizi: "+Arrays.toString(arrCopy));
        System.out.printf("\nPivot indeks %d için: %d işlem yapıldı (%d karşılaştırma, %d swap)\n",
                pivotIndex, numComparisons+numSwaps, numComparisons, numSwaps);

        // tüm indexler için quicksort işlemi yapılıyor ve yapılan işlem sayısı toplamı yazdırılıyor
        // tüm indexler için quicksort işlemi yapılıyor ve yapılan işlem sayısı toplamı yazdırılıyor
        int totalOperations = 0;
        for (int i = 0; i < size; i++) {
            arrCopy = Arrays.copyOf(arr, size); // sıralama için dizi kopyalanıyor
            numSwaps = 0;
            numComparisons = 0;
            quickSort(arrCopy, 0, size - 1, i);
            totalOperations += (numComparisons+numSwaps);
            System.out.printf("Pivot indeks %d için: %d işlem yapıldı (%d karşılaştırma, %d swap)\n",
                    i, numComparisons+numSwaps, numComparisons, numSwaps);
        }
        System.out.printf("\nTüm pivot indeksleri için toplam %d işlem yapıldı.\n", totalOperations);


    }

    private static void quickSort(int[] arr, int start, int end, int index) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end, index);
            if (pivotIndex == index) { // pivot indeksi seçilen indekse eşit mi diye kontrol ediliyor
                return;
            } else if (index < pivotIndex) {
                quickSort(arr, start, pivotIndex - 1, index);
            } else {
                quickSort(arr, pivotIndex + 1, end, index);
            }
        }
    }

    private static int partition(int[] arr, int start, int end, int index) {
        swap(arr, start, index); // pivot elemanı ilk eleman yapılıyor
        int pivot = arr[start];
        int i = start + 1;
        for (int j = start + 1; j <= end; j++) {
            numComparisons++; // her karşılaştırma işlemi için sayaç arttırılıyor
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
                numSwaps++; // her swap işlemi için sayaç arttırılıyor
            }
        }
        swap(arr, start, i - 1);
        numSwaps++;
        return i - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        numSwaps++; // her swap işlemi için sayaç arttırılıyor

    }

    private static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
