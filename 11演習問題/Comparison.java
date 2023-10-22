class Comparison{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    //‘å‚«‚¢‚Ù‚¤‚Ì’l‚ð•\Ž¦
    if(a < b) {
      System.out.println("‘å‚«‚¢‚Ì‚Í" + b + "‚Å‚·");
    } else if(a > b) {
      System.out.println("‘å‚«‚¢‚Ì‚Í" + a + "‚Å‚·");
    } else {
      System.out.println("“¯‚¶‚Å‚·");
    }
  }
}
