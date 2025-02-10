import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            double a = Double.parseDouble(input[0]);
            double b = Double.parseDouble(input[1]);

            System.out.println(a / b);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("숫자를 올바르게 입력하세요.");
        }
    }
}
