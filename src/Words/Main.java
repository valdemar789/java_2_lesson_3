package Words;

import java.util.*;

    public class Main {
        public static void main(String[] args){
            List<String> words = Arrays.asList(
                    "Береза", "Осина", "Дуб", "Осина", "Ель",
                    "Дуб", "Дуб", "Клен", "Осина",
                    "Сосна", "Дуб", "Береза"
            );

            Set<String> unique = new HashSet<String>(words);

            System.out.println("Начальный массив");
            System.out.println(words.toString());
            System.out.println("Уникальные слова");
            System.out.println(unique.toString());
            System.out.println("Сколько раз встречается каждое слово");
            for (String key : unique) {
                System.out.println(key + ": " + Collections.frequency(words, key));
            }
        }
    }

