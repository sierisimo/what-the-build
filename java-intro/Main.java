class Main {
  public static void main(String[] args) {
    sleep();
    Message helloMessage = new Message("Hello Java");

    System.out.println(helloMessage);
    sleep();
  }

  private static void sleep() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
