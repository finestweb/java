import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
public class Main{
    public static void main(String[] args) {
		simple();
		hard();
    }

   static void simple(){
    	final int size = 100;
	final int h = size / 2;
	float[] arr = new float[size];
	long start = System.currentTimeMillis();

    	for(int i = 0; i < size; i++){
		arr[i] = (float)1;
		System.out.println(arr[i]);
	}

	for(int i = 0; i < size; i++){
		arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
		System.out.println(arr[i]);
	}

	long end = System.currentTimeMillis() - start;

	System.out.println(end);
    }

    static void hard(){
    	final int size = 100;
	final int h = size / 2;
	float[] arr = new float[size];
	float[] arr1 = new float[h];
	float[] arr2 = new float[h];
	long start2 = System.currentTimeMillis();

	for(int i = 0; i < size; i++){
		arr[i] = (float)1;
		System.out.println(arr[i]);
	}

	System.arraycopy(arr, 0, arr1, 0, h);
	System.arraycopy(arr, h, arr2, 0, h);

	for(int k = 0; k < h; k++){
		arr1[k] = (float)(arr1[k] * Math.sin(0.2f + k / 5) * Math.cos(0.2f + k / 5) * Math.cos(0.4f + k / 2));
		System.out.println(arr1[k]);
	}

	for(int j = 0; j < h; j++){
		arr2[j] = (float)(arr2[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j/ 2));
		System.out.println(arr2[j]);
	}

	//Объединение двух массивов

	System.arraycopy(arr1, 0, arr, 0, h);
	System.arraycopy(arr2, 0, arr, h, h);

	long end2 = System.currentTimeMillis() - start2;

	System.out.println(end2);

    }
}
