// negativeradiusexception is custom exception
class negativeradiusException extends Exception {
    @Override

    public String toString() {
        return "Radius canot be negative ";
    }

    @Override
    public String getMessage() {
        return "Radius canot be negative ";
    }
}

public class j84 {
// throws = sanket(WARNING) to other programmer which is using your function  
    public static double area(int r) throws negativeradiusException{
     if (r<0) {
        throw new negativeradiusException();
     }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // made by harry

        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // shivam = uses divide function created by harry
        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("EXCEPTION");
        }
    }
}
