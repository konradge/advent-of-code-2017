import Days.*;
import Utils.IO.FileUtils;
import Utils.IO.StringUtils;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) throw new RuntimeException("Day not defined");
        int day;
        try {
            day = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Parameter " + args[0] + " is no int!");
        }
        Day dayInstance = switch (day) {
            case 1 -> new Day1();
            case 2 -> new Day2();
            case 3 -> new Day3();
            case 4 -> new Day4();
            case 5 -> new Day5();
            case 6 -> new Day6();
            case 7 -> new Day7();
            case 8 -> new Day8();
            case 9 -> new Day9();
            case 10 -> new Day10();
            case 11 -> new Day11();
            case 12 -> new Day12();
            case 13 -> new Day13();
            case 14 -> new Day14();
            case 15 -> new Day15();
            case 16 -> new Day16();
            case 17 -> new Day17();
            default -> null;
        };
        if (dayInstance == null) throw new RuntimeException("Day number " + day + " has not been implemented yet!");
        String input = FileUtils.readFile("./src/Inputs/day" + day + ".txt").replaceAll("\\r", "");
        dayInstance.init(input);
        System.out.println("+++++++++Day " + day + "+++++++++++");
        System.out.println("--------Part 1-----------");
        System.out.println(dayInstance.part1());
        System.out.println("--------Part 2-----------");
        System.out.println(dayInstance.part2());
    }
}
