package clasesAbstractas;

public class TestLambdaColor {
    public static void main(String[] args) {
        Color color = new Color() {
            @Override
            public String getColor() {
                return "hola";
            }
        };

        int num = 0;

        Color colorLambda = () -> {

            return "hola" + num;
        };

        String res = colorLambda.getColor();
        System.out.println("desde lambda" + res);
        //colorLambda.mensaje();

        Color color2 = () -> "hola";

    }
}
