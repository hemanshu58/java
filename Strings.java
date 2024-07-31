
public class Strings {

    static boolean palindrom(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //to get shortest path from the given x and y cordinates....
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            //south
            if (dir == 'S') {
                y--;
            }

            //north
            if (dir == 'N') {
                y++;
            }

            //west
            if (dir == 'W') {
                x--;
            }
            //east
            if (dir == 'E') {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);

    }

    //largest string in case of ignore case....
    public static void largestString(String fruits[]) {
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println();
        System.out.println("largest :" + largest);
    }

    //String Builder use.....and capital first char of word in sentence....
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        // String path = "WNEENESENNN"
        // System.out.println(getShortestPath(path));

        // String fruits[] = {"apple", "mango", "banana", "pinaple"};
        // largestString(fruits);
        String str = "hello i am hemanshu";
        System.out.println(toUpperCase(str));

    }

}
