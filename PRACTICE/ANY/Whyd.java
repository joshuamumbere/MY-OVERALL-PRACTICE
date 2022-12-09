public class Whyd {
    public static void main(String[] args) {
     int[] Ages=new int[20];
     Ages[0]=80;
     Ages[1]=70;
     Ages[2]=60;
     Ages[3]=50;
     Ages[4]=40;
     Ages[5]=30;
     Ages[6]=20;
     Ages[7]=10;
     int x;
     for(x=0;x<20;x++){
     System.out.println(Ages[x]);
     }
     Ages[19]=100;
     System.out.println(Ages[19]);
     
    }
}
