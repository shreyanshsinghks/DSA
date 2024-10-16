package com.String_16;


public class ShortestPath {
    public static void main(String[] args) {
//        String path = "WNEENESENNN";
        String path = "NSEWW";
        System.out.println(getShortestPath(path));
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char curr = path.charAt(i);
            if (curr == 'N') {
                y++;
            } else if (curr == 'S') {
                y--;
            } else if (curr == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
}
