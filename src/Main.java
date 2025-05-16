public class Main {

    public static void main(String[] args) {
        // циклы
        // 1. while (<логическое выражение>){ <КОД> }
        int age = 13;
        while (age <= 18) {
            age ++;
            System.out.println("Hello");
        }
        // 2. do {<КОД>} while (<логическое выражение>);
        do {
            System.out.println("do-while");
            age++;
        } while (age <= 23);
        // 3. for (<1>;<2>;<3>) { <КОД> }
        // <1> - <Блок инициализации>
        // <2> - <Блок условия выполнения (логическое выражение)>
        // <3> - <Блок пост выполнения>
        // ЛЮБОЙ БЛОК НЕОБЯЗАТЕЛЕН
        // for (;;) { <code> } - бесконечный цикл
        for (int x = 3, y = 8; x < y; x++) {
            System.out.println(x);
        }
        System.out.println("__________________________");
        int[] arr = {1, 3, 7, 8};
        int sum = 0;
        int g = 1;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i]; // sum = sum + arr[i];
            g *= arr[i];
        }
        System.out.println(sum);
        System.out.println(g);
        System.out.println("----------------");

        for (int i = arr.length - 1; i >= 0; i--) {// реверс массива
            System.out.println(arr[i]);
        }
        //4. //foreach// for(<1>:<2>) { <code> } - цикл для массивов
        // <1> - блок для инициализации, НО
        // - нужно объявить только одну переменную
        // - переменная должна совпадать с типом элементов массива
        // <2> - название массива
        System.out.println("__________________");
        for (int v : arr) { // все блоки обязательны
            System.out.println(v);
        }
        /////Пузырек
        int[] buble = {1, -5, 2, -44, 13, -88, 12};
        for (int i = 0; i < buble.length; i++){
            for (int j = buble.length - 1; j > i; j--){
                if (buble[j] < buble[i]) { // > - в обратном порядке
                    int tmp = buble[i];
                    buble[i] = buble[j];
                    buble[j] = tmp;
                }
            }
        }
        System.out.println("----------------");
        for(int v : buble) {
            System.out.println(v);
        }


    }
}
        // git init
        // Создать репозиторий на GITHUB
        // скопировать ссылку (HTTPS)
        // git remote add origin https://github.com/Vasili4653/lesson-16.05.2025.git
        // git add -A
        // git commit -m "комментарий"
        // git push origin master

        //////// добавить после изменений
        // git add -A
        // git commit -m "комментарий"
        // git push origin master








