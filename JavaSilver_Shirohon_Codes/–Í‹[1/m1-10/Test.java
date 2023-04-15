class Test {
    public void name() {
        int i = 0;
        while (i <= 10)
            System.out.print(i++); // Here is the master
        i = 0;// 1
        for (; i < 10;) { System.out.print(i++);}

        for (int j = 0;; j++) { // 2
            System.out.print(j);
            if (j == 10) break;
        }
        i = 1;// 3
        for (;; i += 2) {
            System.out.print(--i);
            if (i == 10) break;
        }
        i = 0;// 4
        for (; i == i;) {
            switch (i) {
                default:
                if ((i += 2) == 10) break;
            }
            System.out.print(--i);
        }
    }
}