public class Number {
    public static void main(String[] args) {
        Number sample=new Number();

        sample.parseLong("r1024");
        sample.parseLong("1024");
        sample.printOtherBasc(1024);


    }
    public long parseLong(String data) {
        long retLong=-1;
        try{
            retLong=Long.parseLong(data);
            System.out.println(retLong);
        } catch (NumberFormatException ne) {
            System.out.println(data+ " is not a number.");
        }catch (Exception e) {
            return retLong;
        }
        return  retLong;
    }
    public void printOtherBasc(long value) {
        System.out.println("original:"+value);
        System.out.println("Binary  :"+Long.toBinaryString(value));
        System.out.println("Hex     :"+Long.toHexString(value));
        System.out.println("Octal   :"+Long.toOctalString(value));
    }
}
