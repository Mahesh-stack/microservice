import com.practice.coding.Company;
import com.practice.coding.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        Company deloitte = new Company(1, "Deloitte",
                List.of(new Employee(1, "Mahesh", "Soft Engg 1", 66000.00),
                        new Employee(2, "Jyoti", "Consultant", 90000.00),
                        new Employee(3, "Meghana", "Anlyst", 75000.00)));

        Company ey = new Company(2, "EY",
                List.of(new Employee(1, "Harry", "Soft Engg 1", 66000.00),
                        new Employee(2, "Ram", "Senior Consultant", 90000.00),
                        new Employee(3, "Rob", "Anlyst", 75000.00)));

  /*     System.out.println(deloitte);
        System.out.println(ey);*/
        companies.add(deloitte);
        companies.add(ey);

        //System.out.println(companies);

        companies.stream().filter(Objects::nonNull).forEach(company -> {
            if (company.getCompName().equals("Deloitte")){
                List<Employee> emps =
                        company.getEmployees().stream()
                                .sorted((e1,e2) ->
                                        Comparator.comparingDouble(Employee::getSalary)
                                                .compare(e1,e2)).toList();
               System.out.println(emps);
            }
        });

       /* companies.stream().filter(company ->
            company != null).collect(Collectors.toList());

        companies.stream().filter(Objects::nonNull).filter(company-> null != company.getCompName()).
                forEach(company -> {
                    System.out.println(company.getCompName());
                    company.getEmployees().stream().filter(Objects::nonNull).forEach(emp -> {
                        System.out.println( emp.getName()+ "=" + emp.getSalary());
                    });
                });*/

     /*   companies.stream().filter(Objects::nonNull).filter(company -> null != company.getCompName()).
                forEach(company -> {
                    System.out.println(company.getCompName());
                    List<Employee> list =
                            company.getEmployees().stream().sorted(Comparator.comparing(employee -> employee.getName()))
                                    .collect(Collectors.toList());
                    list.stream().forEach(emp -> {
                        System.out.println(emp.getName() + "," + emp.getSalary());
                    });
                });*/

/*        companies.stream().filter(Objects::nonNull).filter(comp -> comp.getCompName().equalsIgnoreCase("EY"))
                .findFirst().orElseThrow(()-> new CompanyNotFoundException("Company not found"));*/




        /*Map<String, String> map = new HashMap<>();

        String key = "key1";
        String value = "someValue";

        String key1 = "key1";
        String value2 = "someValue";

        // Use computeIfAbsent to add the key if it's not present
        map.computeIfAbsent(key, k -> value);
        map.computeIfAbsent(key1, k -> value2);

        // Print the map
        System.out.println(map);*/

    }

 /*   public static int computeValueFor(String key) {
        return key.length();
    }*/
}