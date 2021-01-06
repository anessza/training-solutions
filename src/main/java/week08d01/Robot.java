package week08d01;
/*
A feladatban egy robot mozgását fogjuk szimulálni. Képzelj el egy koordináta rendszert,
ahol a robot az origóban van. A robot négy irányba képes mozogni fel, le, balra és jobbra.
A week08d01.Robot osztályban írj egy move() metódust ami egy karaktersorozatot vár.
pl: FFLLLLLBBBBJJJJJJJ, ahol az F = fel, L=le, B=bal, J=jobb. A metódus visszatérési értéke
legyen a robot mozgás utáni pozíciója. A feladat szabadon bővíthető osztályokkal és metódusokkal.
Bónusz kiegészítés, hogyha más karaktert is tartalmaz a paraméter String nem csak a FLBJ
valamelyikét, akkor dobjunk IllegalArgumentExceptiont!
 */


public class Robot {

    public static void move(Point point, String steps) {
        char[] letters = steps.toCharArray();

        for (char item: letters) {
            int koordinataX=point.getKoordinataX();
            int koordinataY= point.getKoordinataY();
            switch (item) {
                case 'F' : {
                    koordinataY = koordinataY + 1;
                    point.setKoordinataY(koordinataY);
                    break;
                }
                case 'L' : {
                    koordinataY = koordinataY - 1;
                    point.setKoordinataY(koordinataY);
                    break;
                }
                case 'B' : {
                    koordinataX = koordinataX - 1;
                    point.setKoordinataX(koordinataX);
                    break;
                }
                case 'J' : {
                    koordinataX = koordinataX + 1;
                    point.setKoordinataX(koordinataX);
                    break;
                }
                default : throw new IllegalArgumentException("hibás karakterlánc");
            }
        }

    }

    public static void main(String[] args) {
            Point kezdoPont = new Point(2, 2);
            String steps = "FJBLJJ";
            move(kezdoPont,steps);

            System.out.println(kezdoPont.toString());
        }

    }