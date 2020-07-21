package com.project.ksiazkaTest;

import javax.naming.ldap.LdapName;
import java.util.ArrayList;
import java.util.List;

public class ArrayTest7 {

    public static void main(String[] args) {
        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();

        list.add(array[0]);
        list.add(array[2]);
        list.set(1,array[1]);
        list.remove(0);
        System.out.println(list);
    }
}
//do lizty dodaje zostaje index 0 z tablicy czyli 6, a potem index 2 czyli 8,
//nastepnie sester ustawia liste index 1 wartoscia indexu 1 tablicy czyli ,
//z listy usuniety zostaje index 0 czyli 6, zostaje sama liczba 9 ktora jest ustawiona seterem
//odp B.