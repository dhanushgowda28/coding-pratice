public class ReversString {

    public static void main(String[] args) {

        String str = "the sky is blue";

        String[] arr = str.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}