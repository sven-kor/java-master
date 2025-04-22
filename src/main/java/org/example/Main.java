package org.example;
import  java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Set<Integer>> allLottos = new ArrayList<>();

        while (true) {
            Set<Integer> lotto = generateLotto();
            allLottos.add(lotto); // 계속 리스트에 추가하면서 메모리 점점 사용
            if (allLottos.size() % 100000 == 0) {
                System.out.println("Generated: " + allLottos.size() + " lotto sets");
            }
        }
    }

    public static Set<Integer> generateLotto() {
        Random random = new Random();
        Set<Integer> lotto = new HashSet<>();
        while (lotto.size() < 6) {
            int number = random.nextInt(45) + 1; // 1 ~ 45
            lotto.add(number);
        }
        return lotto;
    }
}