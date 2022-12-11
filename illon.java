public class illon {
    
    public static void main(String[] args) {
        illon tp = new illon();
        illon.what gf = tp.new what();
        gf.roll_no = 10;
        gf.print();
        gf.name = "XYZ";
        gf.print();
    }

    class what{
        int roll_no;
        String name;

        void print(){
            System.out.println("Roll No : "+roll_no);
            System.out.println("Name : "+name);
        }
    }
}
