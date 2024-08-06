package org.example.NestedInterface;


public class NestedIf implements InterfaceOuter.InterfaceInner {

    @Override
    public void innerMethod() {
    // find the first 15 Prime numbers
        int iteration = 0, num = 0, x = 1, y = 1;
        while (num < 15) {
            y = 1;
            iteration = 0;
            while (y <= x) {
                if (x % y == 0)
                    iteration++;
                y++;
            }
            if (iteration == 2){
                System.out.print("\n" +x);
                num++;
            }
            x++;
        }
    }
}
