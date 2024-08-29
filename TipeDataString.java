public class TipeDataString {
    public static void main(String[] args) {
        // Perbedaan primitive dan non primitive



        String firstName = "Winaldi";
        String lastName = "Tamba";

        //Concat
        //String fullName = firstName *+ lastName
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

    }
}
