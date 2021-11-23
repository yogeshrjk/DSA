package restart.Searching;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Yogesh";
        char letter = 'g';
        System.out.println(search(name, letter));

    }

    static boolean search(String name, char key) {
        if (name.length() == 0) {
            return false;
        }
//        for (int i = 0; i < name.length(); i++){
//            if (key == name.charAt(i)){
//                return true;
//            }
//        }

    for (char ch : name.toCharArray()) {
        if (ch == key)
            return true;
    }
            return false;
    }
    }
