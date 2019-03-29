package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Game {
      static final int SIZE = 3;

        static final char DOT_X = 'X';
        static final char DOT_O = 'O';
        static final char DOT_EMPTY = '*';

        static char[][] field;

        static Scanner sc = new Scanner(System.in);
        static Random random = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Игрок победил!!!");
                    break;
                }
                if(isFull()){
                    System.out.println("Ничья, не осталось места ходить!");
                    break;
                }

                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Компьютер победил!!!");
                    break;
                }
                if(isFull()){
                    System.out.println("Ничья, не осталось места ходить!");
                    break;
                }
            }


        }

        public static void initMap() {
            field = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    field[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            System.out.print("  ");
            for (int i = 1; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y));
            field[y][x] = DOT_X;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
            field[y][x] = DOT_O;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
                return false;
            }
            return field[y][x] == DOT_EMPTY;

        }

        public static boolean checkWin(char symbol) {
            int sum_hor, sum_ver, sum_dia1 = 0, sum_dia2 = 0;
            for (int i = 0; i < 3; i++) {
                sum_hor = 0;
                sum_ver = 0;

                for (int j = 0; j < 3; j++) {
                    sum_hor += field[j][i];
                    sum_ver += field[i][j];
                }
                if (sum_hor == symbol || sum_ver == symbol) {
                    return true;
                }
                if (sum_hor == symbol || sum_ver == symbol) {
                    return true;
                }
            }
            for (int i = 0; i < 3; i++) {
                sum_dia1 += field[i][i];
                sum_dia2 += field[2-i][i];
            }
            if (sum_dia1 == symbol || sum_dia2 == symbol) {

                return true;
            }
            if (sum_dia1 == symbol || sum_dia2 == symbol) {

                return true;
            }


            return false;
        }


        public static boolean isFull() {
            int k = 0;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (field[i][j] == DOT_EMPTY) {
                        k++;
                    }
                }
            }
            return k == 0;
        }
    }


