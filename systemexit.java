class systemexit {
    public static void foo() {
      try {
        int num1 = 5/0;
      }
      catch (Throwable e) {
          e.printStackTrace();
      }
    }

    public static void main( String args[] ) {
      foo();
    }
}
