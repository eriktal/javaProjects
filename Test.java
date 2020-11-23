package emailApplication;

public class Test {

                interface Automobile { String describe(); }

               static class FourWheeler implements Automobile{
                   static String name = "Bus";
                    public String describe(){
                        return " 4 Wheeler " + name; }
                }

               static class TwoWheeler extends FourWheeler{
                   String name = "bike" ;
                    String weel ;
                   public String describe() {


                        return " 2 Wheeler " + name; }
                }

    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler();
        System.out.println(tw.describe());
        FourWheeler fw = new FourWheeler();
        System.out.println(fw.describe());
        System.out.println(Character.MAX_RADIX);
        System.out.println(Short.MAX_VALUE);




    }
                }




