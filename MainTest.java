 public class MainTest {

      public void test_add() {
          if (Main.add(2, 3) != 5) throw new RuntimeException("add(2,3) should return 5");
      }

      public void test_isEven() {
          if (!Main.isEven(4)) throw new RuntimeException("isEven(4) should return true");
          if (Main.isEven(3)) throw new RuntimeException("isEven(3) should return false");
      }

      public void test_max() {
          if (Main.max(3, 7) != 7) throw new RuntimeException("max(3,7) should return 7");
      }

      public void test_factorial() {
          if (Main.factorial(5) != 120) throw new RuntimeException("factorial(5) should return 120");
      }
  }