class Comparison{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    //�傫���ق��̒l��\��
    if(a < b) {
      System.out.println("�傫���̂�" + b + "�ł�");
    } else if(a > b) {
      System.out.println("�傫���̂�" + a + "�ł�");
    } else {
      System.out.println("�����ł�");
    }
  }
}
