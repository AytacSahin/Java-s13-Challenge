package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 */
public class Main {

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData() {

        Healthplan plan1 = new Healthplan(1,"1. Sigorta Planı", Plan.AXA);
        Healthplan plan2 = new Healthplan(1,"2. Sigorta Planı", Plan.ALLIANZ);

        String[] healthPlans = new String[5];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

        Employee user1 = new Employee(1, "John Doe", "johndoe@gmail.com", "1234", healthPlans);
        user1.addHealthPlan(2, "3. Sigorta Planı");
        System.out.println(user1);

        Employee user2 = new Employee(1, "ali", "ali@ali.com", "1234", healthPlans);
        user2.addHealthPlan(3, "4. Sigorta Planı");
        System.out.println(user2);

        String[] developerNames = new String[5];
        developerNames[0] = user2.getFullName();

        Employee junior = new Employee(2, "ahmet", "ahmet@ahmet.com", "1234", healthPlans);

        Company company = new Company(1, "Workintech", 120000, developerNames);
        company.addEmployee(1, junior.getFullName());

        System.out.println(company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.
     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args) {
        workWithData();
    }
}
