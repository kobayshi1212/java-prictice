class Triangle{
  public static void main(String[] args){
    int height = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int area;
    
    //�ʐς̌v�Z
    area = (height * width / 2);
    //�����E���E�ʐς̕\��
    System.out.println("�����F" + height);
    System.out.println("���@�F" + width);
    System.out.println("�ʐρF" + area);

  }
}
