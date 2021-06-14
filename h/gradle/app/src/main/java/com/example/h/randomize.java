package com.example.h;



import java.util.ArrayList;
import java.util.Collections;
public class randomize {
    int x, y, z = 0, r1, r2, r3 = 0, w,u;
    String e, f, g, h;
    void randomm() {
            int min = 1;
            int max = 2020;
            r1 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
            max = 12;

            r2 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
            if ((r1 % 100 == 0) && (r1 % 400 == 0)) {
                switch (r2) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        max = 31;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                    case 2: {
                        max = 29;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        max = 30;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                }

            } else if ((r1 % 100 != 0) && (r1 % 4 == 0)) {
                switch (r2) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        max = 31;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                    case 2: {
                        max = 29;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        max = 30;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                }

            } else {
                switch (r2) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        max = 31;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                    case 2: {
                        max = 28;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: {
                        max = 30;
                        r3 = (int) Math.floor((Math.random() * (min + max - 1)) + min);
                    }
                    break;
                }

            }
            x = (r1 / 100) / 4;
            y = (r1 % 100) / 4;
            if (r2 >= 3) {
                z = ((13 * r2) - 27) / 5;
            } else if (r2 < 3) {
                z = ((13 * r2) + 129) / 5;
            }

            w = r3 + z + (r1 % 100) + y + x - (2 * (r1 / 100));
            if(w>=0)
            {
                u = w%7 ;
            }
            else{
                while(w<0)
                {
                    w= w + 7;
                };
                u = w ;
            }

            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("sunday");
            arrayList.add("monday");
            arrayList.add("tuesday");
            arrayList.add("wednesday");
            arrayList.add("thursday");
            arrayList.add("friday");
            arrayList.add("saturday");
            switch (u) {
                case 0: {
                    arrayList.remove("sunday");
                    e = "sunday";
                }
                break;
                case 1: {
                    arrayList.remove("monday");
                    e = "monday";
                }
                break;
                case 2: {
                    arrayList.remove("tuesday");
                    e = "tuesday";
                }
                break;
                case 3: {
                    arrayList.remove("wednesday");
                    e = "wednesday";
                }
                break;
                case 4: {
                    arrayList.remove("thursday");
                    e = "thursday";
                }
                break;
                case 5: {
                    arrayList.remove("friday");
                    e = "friday";
                }
                break;
                case 6: {
                    arrayList.remove("saturday");
                    e = "saturday";
                }
                break;
            }
            Collections.shuffle(arrayList);
            f = arrayList.get(0);
            g = arrayList.get(1);
            h = arrayList.get(2);
        }
            int func1()
            {
                return r1;
            }
            int func2()
            {
                return r2;
            }
            int func3()
            {
                return r3;
            }
            String func4()
            {
                return e;
            }
            String func5()
            {
                return f;
            }
            String func6()
            {
                return g;
            }
            String func7()
            {
                return h;
            }
};
