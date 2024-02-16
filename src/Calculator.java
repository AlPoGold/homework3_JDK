public class Calculator<T extends Number> {

    public static final String ERROR_MSG = "Unknown type";
    public static <T extends Number> T sum(T num1, T num2) {
        return (T)Double.valueOf(num1.doubleValue() + num2.doubleValue());
    }
    public static <T extends Number> T multiply(T num1, T num2) {
        return (T)Double.valueOf(num1.doubleValue() * num2.doubleValue());
    }
    public static <T extends Number> T divide(T num1, T num2) {
        if(num2.intValue()==0) throw new ArithmeticException("Divided by zero");
        return (T)Double.valueOf(num1.doubleValue() / num2.doubleValue());
    }


    public static <T extends Number> T subtract(T num1, T num2) {
        return (T)Double.valueOf(num1.doubleValue() - num2.doubleValue());
    }


    /* SECOND VARIANT */
//    public static <T extends Number> T sum(T num1, T num2) {
//        if (num1 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
//        } else if (num1 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
//        } else {
//            throw new RuntimeException(ERROR_MSG);
//        }
//    }
//
//    public static <T extends Number> T multiply(T num1, T num2) {
//        if (num1 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
//        } else if (num1 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
//        } else {
//            throw new RuntimeException(ERROR_MSG);
//        }
//    }
//
//    public static <T extends Number> T divide(T num1, T num2) {
//        if (num2.intValue() == 0) {
//            throw new ArithmeticException("Divide by zero");
//        }
//
//        if (num1 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() / num2.intValue());
//        } else if (num1 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
//        } else {
//            throw new RuntimeException(ERROR_MSG);
//        }
//    }
//
//    public static <T extends Number> T subtract(T num1, T num2) {
//        if (num1 instanceof Integer) {
//            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
//        } else if (num1 instanceof Double) {
//            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
//        } else {
//            throw new RuntimeException(ERROR_MSG);
//        }
//    }
}