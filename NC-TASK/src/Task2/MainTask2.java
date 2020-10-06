package Task2;




import java.util.Arrays;

import Task2.buildings.Dwelling;
import Task2.buildings.DwellingFloor;
import Task2.buildings.Flat;

public class MainTask2 {

    public static void main(String[] args){

        Flat  flat1 = new Flat(2,4411);
        Flat  flat2 = new Flat(2,101);
        Flat  flat3 = new Flat(4,12722);
        Flat  flat4 = new Flat(3,435);
        Flat  flat5 = new Flat(1,1242);
        Flat  flat6 = new Flat(4,1422);
        Flat  flat7 = new Flat(6,1222);
        Flat  flat8 = new Flat(7,635);
        Flat  flat9 = new Flat(2,22233);
        Flat  flat10 = new Flat(1,122662);
        Flat  flat11 = new Flat(4,345);
        Flat  flat12 = new Flat(2,345);
        Flat  flat13 = new Flat(5,3121);
        Flat  flat14 = new Flat(5,551);
        Flat  flat15 = new Flat(6,1414);

        Flat [] flats1 = {flat1,flat2,flat3,flat4,flat5};
        Flat [] flats2 = {flat6,flat7,flat8,flat9,flat10};
        Flat [] flats3 = {flat11,flat12,flat13,flat14,flat15};

        DwellingFloor dwellingFloor1 = new DwellingFloor(flats1);
        DwellingFloor dwellingFloor2 = new DwellingFloor(flats2);
        DwellingFloor dwellingFloor3 = new DwellingFloor(flats3);


        DwellingFloor [] floors ={dwellingFloor1,dwellingFloor2,dwellingFloor3};


        Dwelling dwelling = new Dwelling(floors);




        Flat  flatSet1 = new Flat(1,0);
        Flat  flatSet2 = new Flat(1,0);
        Flat  flatSet3 = new Flat(1,0);

        dwelling.setFlatInHouse(2,3,flatSet1);
        dwelling.setFlatInHouse(4,1,flatSet2);
        dwelling.setFlatInHouse(3,2,flatSet3);

   /*     dwelling.deleteFlatInHouse(1,1);
        dwelling.deleteFlatInHouse(2,4);
        dwelling.deleteFlatInHouse(3,2);*/

        System.out.println("количесво квартир"+" "+ dwelling.getAllFlat());

        System.out.println();
        System.out.println("лучшая полощадь"+" "+dwelling.getBestSpace());
        System.out.println();
        System.out.println("количество этажей"+" "+dwelling.getNumberFloor());
        System.out.println();
        System.out.println("количество комнат в доме"+" "+ dwelling.getAllRoom());
        System.out.println();
        System.out.println("ощая площадь в доме"+" "+dwelling.getAllArea());
        System.out.println();

        System.out.println("сортировка квартир по убыванию площади в доме"+" "+Arrays.toString(dwelling.getSortFlatArea()));






    }
}