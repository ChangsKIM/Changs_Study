package e02_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) {
        // 테스트할 요소의 개수
        int elementCount = 100_000;

        // ArrayList와 LinkedList 생성
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 1. 요소 추가 성능 테스트
        System.out.println("=== 요소 추가 성능 테스트 ===");
        // ArrayList 추가 시간 측정
        long startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList 추가 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // LinkedList 추가 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 추가 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 2. 요소 접근 성능 테스트
        System.out.println("\n=== 요소 접근 성능 테스트 ===");
        // ArrayList 접근 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 접근 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // LinkedList 접근 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 접근 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 3. 요소 중간에 삽입 성능 테스트
        System.out.println("\n=== 요소 중간 삽입 성능 테스트 ===");
        // ArrayList 중간 삽입 시간 측정
        startTime = System.nanoTime();
        arrayList.add(elementCount / 2, -1);
        endTime = System.nanoTime();
        System.out.println("ArrayList 중간 삽입 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // LinkedList 중간 삽입 시간 측정
        startTime = System.nanoTime();
        linkedList.add(elementCount / 2, -1);
        endTime = System.nanoTime();
        System.out.println("LinkedList 중간 삽입 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 4. 요소 삭제 성능 테스트
        System.out.println("\n=== 요소 삭제 성능 테스트 ===");
        // ArrayList 삭제 시간 측정
        startTime = System.nanoTime();
        arrayList.remove(elementCount / 2);
        endTime = System.nanoTime();
        System.out.println("ArrayList 삭제 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // LinkedList 삭제 시간 측정
        startTime = System.nanoTime();
        linkedList.remove(elementCount / 2);
        endTime = System.nanoTime();
        System.out.println("LinkedList 삭제 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
