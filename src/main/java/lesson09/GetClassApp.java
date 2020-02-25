package lesson09;

public class GetClassApp {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    Pizza pizza = new Pizza();
    dosomething(Pizza.class);
    String simpleName = pizza.getClass().getSimpleName();
    System.out.println(simpleName);
  }

  private static void dosomething(Class<Pizza> clazz) throws IllegalAccessException, InstantiationException {
    Pizza pizza = clazz.newInstance();

  }
}
