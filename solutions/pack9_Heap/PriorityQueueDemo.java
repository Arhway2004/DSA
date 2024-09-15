package solutions.pack9_Heap;

import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp " + name + "(" + salary + ")";
    }
}

public class PriorityQueueDemo {
    public static void demo_priorityQueue() {
        PriorityQueue<Employee> pq = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e1.salary, e2.salary)
        );

        List<Employee> list = Arrays.asList(
                new Employee("Yindee", 2000),
                new Employee("Preeda", 1500),
                new Employee("Pramote", 3000)
        );

        pq.addAll(list);
        System.out.println(pq); // Output: [Emp Preeda(1500), Emp Yindee(2000), Emp Pramote(3000)]
    }

    public static void main(String[] args) {
        demo_priorityQueue();
    }
}
