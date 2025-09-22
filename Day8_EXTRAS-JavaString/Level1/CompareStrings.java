public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if (result == 0)
            System.out.println(str1 + " equals " + str2);
        else if (result < 0)
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        else
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order");
    }
}

