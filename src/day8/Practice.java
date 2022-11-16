package day8;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {8, 2 , 5, 3, 4, 7, 6, 1, -5, 999}; // Створив масив чисел
        mergeSort(arr); // Застосував метод сортування злиттям

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " "); // Виводимо на екран нашу програму
    }

    private static void mergeSort(int[] arr) { // Метод який ділить наш масив на два
        int n = arr.length;
        if (n==1) return; //Враховуючи що це рекурсивний масив ми його десь повині зупинити, зупиниться коли n буде дорівнювати одиниці

        int mid = n / 2; // Поділили масив на два
        int[] l = new int[mid]; //Створили масив для лівого масиву чисел
        int[] r = new int[n - mid]; //Створили масив для правого масиву чисел

        for (int i = 0; i < mid; i++)
            l[i] = arr[i]; //Всю ліву частину масиву ми присвоюємо до l[i]
        for (int i = mid; i < n; i++)
            r[i - mid] = arr[i]; //Всю праву частину масиву ми присвоюємо до r[i - mid]

        mergeSort(l); // Продовжуємо мержити, закінули ліву частину
        mergeSort(r); // Закинули праву частину, щоб вони ділилися на два
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) { // Метод яким ми з'єднуємо всі елементи
        int left = l.length; //Вказали ліву частину
        int right = r.length; //Вказали праву частину
        int i = 0; // i відповідає за ліву частину
        int j = 0; // j відповідає за праву частину
        int idx = 0;

        while (i < left && j < right){
            if (l[i] < r[j]){ // Починаємо мерджити (обєднувати) беремо нульовий елемент лівого та правого масиву і порівнюємо, от який менше ми сохраняємо в arr
                arr[idx]=l[i];
                i++;
                idx++;
            }
            else {   //Якщо l[i] не менше а r[j] менше або дорівнює то до arr[idx] присвоюємо r[j]
                arr[idx] = r[j];
                j++;
                idx++;
            }
        }
        for (int ll = i; ll < left; ll++) // Цикл для лівого масиву
            arr[idx++] = l[ll]; //Остатки чисел засовуємо в l[ll]
        for (int rr = j; rr < right; rr++) // Цикл для правого масиву
            arr[idx++] = r[rr]; //Остатки чисел засовуємо в r[rr]
    }
}
