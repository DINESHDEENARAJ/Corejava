package dhennabasic;

public class bbbarithmatic
{
    static double name='s';// static
    float volume=6.8f;// global
    public static void main(String[] args) {
        int aa=2000;
        short bb=100;
        System.out.println("first value:" +  (aa+bb));

        System.out.println("second value:"+(aa-bb));//instance

        System.out.println("thirdvalue:" + (aa/bb));

        System.out.println("fourthvalue:"+(aa*bb));
        System.out.println("fifthvalue:"+(aa%bb));
        bbbarithmatic cell = new bbbarithmatic();
        cell.pc();
    }
        public void pc()
        {
            long cc=1234569875212l;

         System.out.println("local:" + cc);
         System.out.println("static name:" + name);//local
             System.out.println("global volume:" + volume);
    }
}
